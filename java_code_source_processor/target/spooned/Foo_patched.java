public class Foo_patched {
    public void testFromTask(int input, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
            {
                int expVal_01f5db5cda3646f7830304a7f0dd91c0 = input;
                if (java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 0)) {
                    logger.append(input);
                    return;
                } else if (!java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 0) && !java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 6) && !java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 3) && !java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 1)) {
                    logger.append("DEFAULT");
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 3) || java.util.Objects.equals(expVal_01f5db5cda3646f7830304a7f0dd91c0, 6)) {
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else {
                    logger.append(input);
                }
            }
        }
        logger.append("AFTER");
    }

    public java.lang.String getValue(java.lang.StringBuilder logger) {
        logger.append("getValue is called");
        return "";
    }

    public void testEmptyCase(int input, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_71209e9e0998402bb23c117f3d94c079 = getValue(logger);
        }
    }

    public int testColonSwitchWithReturns(int arg, java.lang.StringBuilder logger) {
        for (int i = 0; i < 10; i++) {
            {
                int expVal_8fa5cfe8f7b841fd9eb035ba6b57912e = arg;
                if (java.util.Objects.equals(expVal_8fa5cfe8f7b841fd9eb035ba6b57912e, 1) || java.util.Objects.equals(expVal_8fa5cfe8f7b841fd9eb035ba6b57912e, 0)) {
                    logger.append(1);
                    return 1;
                } else if (java.util.Objects.equals(expVal_8fa5cfe8f7b841fd9eb035ba6b57912e, 2)) {
                    logger.append(2);
                    return 2;
                } else {
                    logger.append(0);
                    return 0;
                }
            }
        }
        logger.append(100);
        return 100;
    }

    public void testMostPrimitiveCase(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_d7893e9b9b084407b1177623b3530cad = arg;
            if (java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "1") || java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "0")) {
                logger.append(1);
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "2")) {
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (!java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "0") && !java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "1") && !java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "2") && !java.util.Objects.equals(expVal_d7893e9b9b084407b1177623b3530cad, "3")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testMostPrimitiveCase2(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_43a04f3c56a74711a8837f06e90031b5 = arg;
            if (java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "1") || java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "0")) {
                logger.append(1);
                logger.append("default");
                logger.append(3);
            } else if ((!java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "0") && !java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "1") && !java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "2") && !java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "3")) || java.util.Objects.equals(expVal_43a04f3c56a74711a8837f06e90031b5, "2")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testColonSwitchStatement(int arg, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int i = 0; i < 10; i++) {
            {
                int expVal_e1d9bd05b1044da18f817f6ceb7c13bb = i;
                if (!java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 1) && !java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 2) && !java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 3) && !java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 4)) {
                    logger.append("DEFAULT" + arg);
                    int expVal_4b83895862d146a4bc1ecdb6fa146144 = i * 2;
                    if (java.util.Objects.equals(expVal_4b83895862d146a4bc1ecdb6fa146144, 7) || java.util.Objects.equals(expVal_4b83895862d146a4bc1ecdb6fa146144, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 1)) {
                    int expVal_4b83895862d146a4bc1ecdb6fa146144 = i * 2;
                    if (java.util.Objects.equals(expVal_4b83895862d146a4bc1ecdb6fa146144, 7) || java.util.Objects.equals(expVal_4b83895862d146a4bc1ecdb6fa146144, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 3) || java.util.Objects.equals(expVal_e1d9bd05b1044da18f817f6ceb7c13bb, 2)) {
                    logger.append("2 or 3");
                    logger.append("4");
                } else {
                    logger.append("4");
                }
            }
        }
        logger.append("AFTER");
    }
}