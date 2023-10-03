import processor.SwitchExpressionProcessor;
import processor.SwitchProcessor;
import spoon.Launcher;

public class App {
    public void launch(String inPath, String outPath) {
        final var launcher = new Launcher();
        launcher.setArgs(new String[]{
                "-i", inPath,
                "-o", outPath
        });
        launcher.addProcessor(new SwitchProcessor());
        launcher.addProcessor(new SwitchExpressionProcessor());
        launcher.run();
    }
}
