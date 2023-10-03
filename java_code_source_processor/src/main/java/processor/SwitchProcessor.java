package processor;

import processor.core.CtIfBuilder;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtSwitch;

/**
 *  Класс, наследник AbstractProcessor, преобразующий оператор Switch в набор операторов If.
 *  Основная логика преобразования реализована в классе CtIfBuilder
 */
public class SwitchProcessor extends AbstractProcessor<CtSwitch> {
    @Override
    public void process(CtSwitch ctSwitch) {
        final var ctIfBuilder = new CtIfBuilder(ctSwitch);
        final var statement = ctIfBuilder.build();
        ctSwitch.replace(statement);
    }
}
