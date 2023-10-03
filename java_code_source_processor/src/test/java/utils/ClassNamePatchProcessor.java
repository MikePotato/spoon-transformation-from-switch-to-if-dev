package utils;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;

/**
 * Добавляет к имени обработанного класса суффикс "_patched"
 */
public class ClassNamePatchProcessor extends AbstractProcessor<CtClass> {
    @Override
    public void process(CtClass ctClass) {
        ctClass.setSimpleName(ctClass.getSimpleName() + "_patched");
    }
}
