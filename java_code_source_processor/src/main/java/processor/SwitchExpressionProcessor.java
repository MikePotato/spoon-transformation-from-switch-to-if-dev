package processor;

import processor.core.CtIfBuilder;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtSwitchExpression;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;

import java.util.UUID;

/**
 *  Класс, наследник AbstractProcessor, преобразующий выражение Switch в метод, содержащий набор операторов If.
 *  Основная логика преобразования реализована в классе CtIfBuilder
 */
public class SwitchExpressionProcessor extends AbstractProcessor<CtSwitchExpression> {
    @Override
    public void process(CtSwitchExpression cse) {
        final var ctIfBuilder = new CtIfBuilder(cse);
        final var resultStatement = ctIfBuilder.build();
        final var ctMethod = getMethod(cse, resultStatement);
        cse.getParent(CtClass.class).addMethod(ctMethod);
        cse.replace(cse.getFactory().createCodeSnippetExpression(ctMethod.getSimpleName() + "(" + cse.getSelector() + ")"));
    }


    /**
     * Метод создает метод-обертку для набор операторов If, которые были сгенерены по условиям в исходном выражении Switch
     */
    private static CtMethod<Object> getMethod(CtSwitchExpression cse, CtStatement ifStatement) {
        final var methodName = "switchMethod_:suffix".replace(":suffix", UUID.randomUUID().toString().replace("-", ""));
        final var ctMethod = cse.getFactory().createMethod();
        ctMethod.setSimpleName(methodName);
        ctMethod.setType(cse.getType());

        final var ctParameter = cse.getFactory().createParameter();
        ctParameter.setType(cse.getSelector().getType());
        ctParameter.setSimpleName(cse.getSelector().toString());
        ctMethod.addParameter(ctParameter);
        ctMethod.setBody(ifStatement);
        return ctMethod;
    }
}
