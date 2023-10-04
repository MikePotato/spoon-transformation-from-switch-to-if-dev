import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

/**
 *  Класс с тестами на методы из задания.
 *  Судя по разному поведению на одинаковые входные данные, методы функционально не тождественны.
 */
public class TaskSnippetsTests {
    @Test
    public void Test(){
//        IntStream.range(0, 10).forEach((val) -> {
//            final var logger1 = new StringBuilder();
//            final var logger2 = new StringBuilder();
//            final var origin = new Origin();
//            origin.test1(val, logger1);
//            origin.test2(val, logger2);
//
//            System.out.println("-------------------------------");
//            System.out.println(logger1);
//            System.out.println(logger2);
//            Assert.assertEquals(logger1.toString(), logger2.toString());
//        });
    }

    static class Origin {
        public void test1(int input, StringBuilder logger) {
            logger.append("BEFORE");
            for (int x = 0; x < 10 ; x++) {
                switch (input) {
                    case 0: {
                        logger.append(input);
                        return;
                    }
                    default: {
                        logger.append("DEFAULT");
                    }
                    case 6:
                    case 3: {
                        logger.append(2);
                        logger.append(input);
                        continue;
                    }
                    case 1: {
                        logger.append(input);
                        break;
                    }
                }
            }
            logger.append("AFTER");
        }

        public void test2(int input, StringBuilder logger) {
            logger.append("BEFORE");
            for (int x = 0; x < 10; x++) {
                if (input == 0) {
                    logger.append(input);
                    return;
                } else if (input == 3 || input == 6) {
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (input == 1) {
                    logger.append(input);
                    break;
                } else {
                    logger.append("DEFAULT");
                }
            }
            java.lang.System.out.println("AFTER");
        }
    }
}
