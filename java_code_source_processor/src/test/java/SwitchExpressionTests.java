import org.junit.BeforeClass;
import org.junit.Test;
import processor.SwitchExpressionProcessor;
import processor.SwitchProcessor;
import spoon.Launcher;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import utils.ClassNamePatchProcessor;
import utils.MethodTestBase;

import java.util.stream.IntStream;

public class SwitchExpressionTests extends MethodTestBase {
    @Override
    public void generateSources() {
        final var l = new Launcher();
        l.setArgs(new String[]{"--compile"});
        l.addInputResource("src/test/resources/Foo3.java");
        l.addProcessor(new ClassNamePatchProcessor());
        l.addProcessor(new SwitchProcessor());
        l.addProcessor(new SwitchExpressionProcessor());
        l.getEnvironment().setComplianceLevel(18);
        l.setSourceOutputDirectory("target/spooned");
        l.run();
    }

    public SwitchExpressionTests() {
        super("spooned-classes", "Foo3", "Foo3_patched");
    }

    @Test
    public void testSimpleExpression(){
        executeFunction("testSimpleExpression", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleExpressionWithDoubleBrackets(){
        executeFunction("testSimpleExpressionWithDoubleBrackets", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleExpressionWithYields1(){
        executeFunction("testSimpleExpressionWithYields1", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleExpressionWithYields2(){
        executeFunction("testSimpleExpressionWithYields2", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleExpressionWithSomeYield(){
        executeFunction("testSimpleExpressionWithSomeYield", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }

    @Test
    public void testSimpleExpressionWithNested(){
        executeFunction("testSimpleExpressionWithNested", new Class[]{int.class}, IntStream.range(0, 10).boxed());
    }
}
