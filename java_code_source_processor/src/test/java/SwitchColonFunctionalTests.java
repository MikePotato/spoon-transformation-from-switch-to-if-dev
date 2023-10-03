import org.junit.BeforeClass;
import org.junit.Test;
import processor.SwitchExpressionProcessor;
import processor.SwitchProcessor;
import spoon.Launcher;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import utils.ClassNamePatchProcessor;
import utils.MethodTestBase;

import java.util.stream.IntStream;

public class SwitchColonFunctionalTests extends MethodTestBase {

    @Override
    public void generateSources() {
        final var l = new Launcher();
        l.setArgs(new String[]{"--compile"});
        l.addInputResource("src/test/resources/Foo.java");
        l.addProcessor(new ClassNamePatchProcessor());
        l.addProcessor(new SwitchProcessor());
        l.addProcessor(new SwitchExpressionProcessor());
        l.getEnvironment().setComplianceLevel(18);
        l.setSourceOutputDirectory("target/spooned");
        l.run();
    }
    public SwitchColonFunctionalTests() {
        super("spooned-classes", "Foo", "Foo_patched");
    }

    @Test
    public void testEmptyCase() {
        executeMethod("testEmptyCase", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testFromTask() {
        executeMethod("testFromTask", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testColonSwitchWithReturns() {
        executeMethod("testColonSwitchWithReturns", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testMostPrimitiveCase() {
        executeMethod("testMostPrimitiveCase", new Class[]{String.class, StringBuilder.class}, IntStream.range(0, 10).mapToObj(i -> String.valueOf(i)));
    }

    @Test
    public void testMostPrimitiveCase2() {
        executeMethod("testMostPrimitiveCase2", new Class[]{String.class, StringBuilder.class}, IntStream.range(0, 10).mapToObj(i -> String.valueOf(i)));
    }


    @Test
    public void testColonSwitchStatement() {
        executeMethod("testColonSwitchStatement", new Class[]{int.class, StringBuilder.class}, IntStream.range(0, 10).boxed());
    }
}
