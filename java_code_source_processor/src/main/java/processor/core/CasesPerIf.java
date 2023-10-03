package processor.core;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, содержащий информацию о case относящихся к одному и тому же If.
 * Предоставляется методы для получения общих expressions и statements
 */
public class CasesPerIf {
    private final CtCase source;
    private final List<CtStatement> statements = new ArrayList<>();
    private final List<CtExpression> expressions = new ArrayList<>();
    private Boolean isDefault = false;

    public CasesPerIf(CtCase ctCase) {
        source = ctCase;
        this.addCaseExpressions(ctCase.getCaseExpressions());
        this.addStatements(ctCase.getStatements());
        if (this.expressions.isEmpty()){
            this.isDefault = true;
        }
    }

    public void addCaseExpressions(List<CtExpression> ctExpressions)  {
        this.expressions.addAll(ctExpressions);
    }

    public void addStatements(List<CtStatement> ctStatements)  {
        this.statements.addAll(ctStatements);
    }

    public CtCodeSnippetExpression<Boolean> getFinalExpression(CtLocalVariable expressionVariable) {
        final var exp = this.expressions.stream()
                .map(it -> "java.util.Objects.equals(" + expressionVariable.getSimpleName() + ", " + it.toString() + ")")
                .collect(Collectors.joining(" || "));;
        return source.getFactory().Code().<Boolean>createCodeSnippetExpression(isDefault ? getDefaultExpression(expressionVariable) : exp);
    }

    private String getDefaultExpression(CtLocalVariable expressionVariable) {
        final var ctSwitch = (CtAbstractSwitch<?>)this.source.getParent(CtAbstractSwitch.class);
        final var defExp = ctSwitch.getCases().stream()
                .filter(it -> !it.getCaseExpressions().isEmpty())
                .map(it -> it.getCaseExpressions()).flatMap(x -> x.stream())
                .map(it -> "!java.util.Objects.equals(" + expressionVariable.getSimpleName() + ", " + it + ")")
                .collect(Collectors.joining(" && "));

        final var exp = this.expressions.stream()
                .map(it -> "java.util.Objects.equals(" + expressionVariable.getSimpleName() + ", " + it.toString() + ")")
                .collect(Collectors.joining(" || "));;

        return exp.isEmpty() || exp.isBlank() ? defExp :  "(:defExp) || :exp".replace(":defExp", defExp).replace(":exp", exp);
    }

    public CtBlock getFinalBlockWithStatements(){
        final var ctBlock = source.getFactory().createBlock();
        this.statements.forEach(x -> {
            final var fakeBlock = source.getFactory().createBlock().addStatement(x.clone());
            replaceYieldStatement(fakeBlock, source.getParent());
            final var processedX = fakeBlock.getStatement(0);
            if(processedX instanceof CtBlock<?>) {
                ((CtBlock<?>) processedX).getStatements().forEach(st -> ctBlock.addStatement(st.clone()));
            } else {
                ctBlock.addStatement(processedX.clone());
            }
        });
        final var lastStatement = ctBlock.getLastStatement();
        if(lastStatement instanceof CtBreak) {
            ctBlock.removeStatement(lastStatement);
        }
        return ctBlock;
    }

    public void replaceYieldStatement(CtStatementList statement, CtElement originalSource) {
        statement.getStatements().forEach(x -> {
            if(x instanceof CtYieldStatement) {
                if(originalSource instanceof CtSwitch<?>) {
                    final var newStatement = originalSource.getFactory().createCodeSnippetStatement(((CtYieldStatement) x).getExpression().toString());
                    x.replace(newStatement);
                }
                if(originalSource instanceof CtSwitchExpression<?,?>) {
                    final var newStatement = originalSource.getFactory().createReturn();
                    newStatement.setReturnedExpression(originalSource.getFactory().createCodeSnippetExpression(((CtYieldStatement) x).getExpression().toString()));
                    x.replace(newStatement);
                }
            }
            if(x instanceof CtStatementList) {
                replaceYieldStatement(((CtStatementList)x), originalSource);
            }
        });
    }
}
