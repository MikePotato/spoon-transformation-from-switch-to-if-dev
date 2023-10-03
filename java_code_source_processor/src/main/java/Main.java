import utils.Utils;

public class Main {
    public static void main(String[] args) {
        try {
            var inPath = Utils.getArgByKey(args, "--ARG_NAME_FOR_INPUT");
            var outPath = Utils.getArgByKey(args, "--ARG_NAME_FOR_OUTPUT");;
            new App().launch(inPath, outPath);
            System.out.println("Результаты работы программы были помещены в :folder.".replace(":folder", outPath));
        } catch (Exception ex) {
            System.out.println("В ходе работы программы возникла непредвиденная ошибка. " + ex);
        }
    }

}