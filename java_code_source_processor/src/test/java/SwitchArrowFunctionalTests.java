import org.junit.BeforeClass;
import org.junit.Test;
import processor.SwitchExpressionProcessor;
import processor.SwitchProcessor;
import spoon.Launcher;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import utils.ClassNamePatchProcessor;
import utils.MethodTestBase;

import java.util.stream.IntStream;

public class SwitchArrowFunctionalTests extends MethodTestBase {
    @Override
    public void generateSources() {
        final var l = new Launcher();
        l.setArgs(new String[]{"--compile"});
        l.addInputResource("src/test/resources/Foo2.java");
        l.addProcessor(new ClassNamePatchProcessor());
        l.addProcessor(new SwitchProcessor());
        l.addProcessor(new SwitchExpressionProcessor());
        l.getEnvironment().setComplianceLevel(18);
        l.setSourceOutputDirectory("target/spooned");
        l.run();
    }

    public SwitchArrowFunctionalTests() {
        super("spooned-classes", "Foo2", "Foo2_patched");
    }

    @Test
    public void testSimpleArrowCase() {
        executeMethod("testSimpleArrowCase", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleArrowCaseWithNestedSwitch() {
        executeMethod("testSimpleArrowCaseWithNestedSwitch", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testComplexArrowCase() {
        executeMethod("testComplexArrowCase", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testComplexArrowCaseWithDoubleBrackets() {
        executeMethod("testComplexArrowCaseWithDoubleBrackets", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }
}
