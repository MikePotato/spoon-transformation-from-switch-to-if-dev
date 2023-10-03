public class Foo {

    public void testFromTask(int input, StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
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

    public String getValue(StringBuilder logger){
        logger.append("getValue is called");
        return "";
    }

    public void testEmptyCase(int input, StringBuilder logger){
        switch (getValue(logger)){

        }
    }

    public int testColonSwitchWithReturns(int arg, StringBuilder logger){
        for (int i = 0; i < 10; i++) {
            switch (arg) {
                case 0 :
                case 1 : {
                    logger.append(1);
                    return 1;
                }
                case 2: {
                    logger.append(2);
                    return 2;
                }
                default: {
                    logger.append(0);
                    return 0;
                }
            }
        }
        logger.append(100);
        return 100;
    }
    public void testMostPrimitiveCase(String arg, StringBuilder logger){
        switch (arg) {
            case "0":
            case "1":{
                logger.append(1);
            }
            case "2": {
                logger.append(2);
            }
            default : {
                logger.append("default");
            }
            case "3": {
                logger.append(3);
            }
        }
    }
    public void testMostPrimitiveCase2(String arg, StringBuilder logger){
        switch (arg) {
            case "0":
            case "1":{
                logger.append(1);
            }
            case "2":
            default : {
                logger.append("default");
            }
            case "3": {
                logger.append(3);
            }
        }
    }

    public void testColonSwitchStatement(int arg, StringBuilder logger) {
        logger.append("BEFORE");
        for (int i = 0; i < 10; i++) {
            switch (i) {
                default:
                    logger.append("DEFAULT" + arg);
                case 1:
                    switch (i * 2) {
                        case 6:

                        case 7: {
                            {
                                for (; ; ) {
                                    break;
                                }
                                i = 4;
                                //break;
                            }
                        }
                        break;
                    }
                    logger.append("1");
                    break;
                case 2:
                case 3:
                    logger.append("2 or 3");
                case 4:
                    logger.append("4");
                    break;
            }
        }
        logger.append("AFTER");
    }

}