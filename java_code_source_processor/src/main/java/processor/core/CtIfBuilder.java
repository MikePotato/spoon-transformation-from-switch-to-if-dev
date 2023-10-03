package processor.core;

import org.apache.commons.lang3.NotImplementedException;
import spoon.reflect.code.*;
import spoon.reflect.path.CtRole;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Класс содержащий логику преобразования указанного Switch (неважно, оператор или выражение) в набор операторов If.
 * За конечное представление Switch (в виде метода или оператора) отвечает соответствующий processor.
 */
public class CtIfBuilder {
    final CtAbstractSwitch source;
    final CtLocalVariable expressionVariable;
    public CtIfBuilder(CtAbstractSwitch ctSwitch) {
        source = ctSwitch;
        expressionVariable = source.getFactory().createLocalVariable();
    }

    public CtStatement build(){
        final var casesPerIfs = getCasesPerIfs(source.getCases()); // группируем case оператора switch по операторам if

        // делаем обертку из скобок для будущего if и переменной, в которой будет лежать результат выполнения условия.
        // Можно заоптимизить и делать переменную, только если в условии используется метод.
        final var parentBlock = source.getFactory().createBlock();
        final var variableName = "expVal_:suffix".replace(":suffix", UUID.randomUUID().toString().replace("-", ""));
        expressionVariable.setSimpleName(variableName);
        expressionVariable.setValueByRole(CtRole.DEFAULT_EXPRESSION, source.getSelector());
        expressionVariable.setValueByRole(CtRole.TYPE, source.getSelector().getType());
        parentBlock.addStatement(expressionVariable);


        if(!casesPerIfs.isEmpty()) {
            //создаем if
            final var ifStatement = generateCtIf(casesPerIfs);
            parentBlock.addStatement(ifStatement);
        } else {
            // не генерим if
        }
        return parentBlock;
    }


    /**
     * Метод возвращающий созданный CtIf. Является точкой начала рекурсии.
     */
    private CtIf generateCtIf(List<CasesPerIf> casesPerIfs) {
        return generateCtIfCore(casesPerIfs.get(0), casesPerIfs.subList(1, casesPerIfs.size()));
    }

    /**
     * Рекурсивный метод, создающий If из обьекта, лежащего в параметре current.
     * В ветку Else текущего If разворачивается следующий If до тех пор пока есть обьекты CasesPerIf в коллекции other
     */
    private CtIf generateCtIfCore(CasesPerIf current, List<CasesPerIf> other) {
        final var ctIf = source.getFactory().createIf();
        ctIf.setCondition(current.getFinalExpression(expressionVariable));
        ctIf.setThenStatement(current.getFinalBlockWithStatements());

        if(!other.isEmpty()) {
            if(other.size() > 1) {
                ctIf.setElseStatement(generateCtIfCore(other.get(0), other.subList(1, other.size())));
            } else {
                ctIf.setElseStatement(other.get(0).getFinalBlockWithStatements());
            }
        }
        return ctIf;
    }


    /**
     * Метод группирующий case по операторам If. Для каждого If создается отдельный объект типа CasesPerIf,
     * который содержит все expressions и statements из сгруппированных cases.
     */
    private List<CasesPerIf> getCasesPerIfs(List<CtCase> cases) {
        final var result = new ArrayList<CasesPerIf>();

        List<CtExpression> expressionsForPreviousEmptyCases = new ArrayList<>();
        cases.forEach((ctCase) -> {
            if(ctCase.getStatements().isEmpty()) { // пустой case должен "схлопнуться" со следующим
                expressionsForPreviousEmptyCases.addAll(ctCase.getCaseExpressions());
            } else {
                CasesPerIf caseData = new CasesPerIf(ctCase);
                caseData.addCaseExpressions(expressionsForPreviousEmptyCases);
                expressionsForPreviousEmptyCases.clear();
                if(!hasFinalToken(ctCase)) { // проверка на "конечность" case. Если case не конечен, собираем в него statements из следущих case.
                    final var startIndex = cases.indexOf(ctCase);
                    for (int i = startIndex + 1; i < cases.size(); i++) {
                        final var additionalCase = cases.get(i);
                        caseData.addStatements(additionalCase.getStatements());
                        if(hasFinalToken(additionalCase)) {
                            break;
                        }
                    }
                }
                result.add(caseData);
            }
        });
        return result;
    }

    /**
     * Метод, определяющий есть ли признак окончания в statement - return, break, etc.
     */
    private boolean hasFinalToken(CtCase item) {
        switch (item.getCaseKind()) {
            case COLON: {
                final var returns = item.getElements(new TypeFilter(CtReturn.class));
                final var breaks = item.getElements(new TypeFilter(CtBreak.class));
                final var throwses = item.getElements(new TypeFilter(CtThrow.class));
                final var continues = item.getElements(new TypeFilter(CtContinue.class));
                final var yields = item.getElements(new TypeFilter(CtYieldStatement.class));
                final var hasBreakOrReturn = !returns.isEmpty() || !breaks.isEmpty() || !throwses.isEmpty() || !continues.isEmpty() ||  !yields.isEmpty();
                return hasBreakOrReturn;
            }
            case ARROW : {
                return true;
            }
            default : {
                throw new NotImplementedException("This case kind (:val) is not supported".replace(":val", item.getCaseKind().toString()));
            }
        }
    }
}
