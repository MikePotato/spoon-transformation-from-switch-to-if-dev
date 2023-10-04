public class Foo_patched {
    public void testFromTask(int input, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
            {
                int expVal_6ed178bd12154c1cbb337916d14d6beb = input;
                if (java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 0)) {
                    logger.append(input);
                    return;
                } else if (!java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 0) && !java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 6) && !java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 3) && !java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 1)) {
                    logger.append("DEFAULT");
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 3) || java.util.Objects.equals(expVal_6ed178bd12154c1cbb337916d14d6beb, 6)) {
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
            java.lang.String expVal_257996726cea47c4b1ce121fd4de4df4 = getValue(logger);
        }
    }

    public int testColonSwitchWithReturns(int arg, java.lang.StringBuilder logger) {
        for (int i = 0; i < 10; i++) {
            {
                int expVal_caf9efddb72f433a8f481bf2922a4031 = arg;
                if (java.util.Objects.equals(expVal_caf9efddb72f433a8f481bf2922a4031, 1) || java.util.Objects.equals(expVal_caf9efddb72f433a8f481bf2922a4031, 0)) {
                    logger.append(1);
                    return 1;
                } else if (java.util.Objects.equals(expVal_caf9efddb72f433a8f481bf2922a4031, 2)) {
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
            java.lang.String expVal_815412b15bd74612b4986e644733feaf = arg;
            if (java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "1") || java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "0")) {
                logger.append(1);
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "2")) {
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (!java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "0") && !java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "1") && !java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "2") && !java.util.Objects.equals(expVal_815412b15bd74612b4986e644733feaf, "3")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testMostPrimitiveCase2(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_58fb5c990c024e3ba269b31ec8c3c4cc = arg;
            if (java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "1") || java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "0")) {
                logger.append(1);
                logger.append("default");
                logger.append(3);
            } else if ((!java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "0") && !java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "1") && !java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "2") && !java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "3")) || java.util.Objects.equals(expVal_58fb5c990c024e3ba269b31ec8c3c4cc, "2")) {
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
                int expVal_917fc676b8ed46459cd2590cc69313de = i;
                if (!java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 1) && !java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 2) && !java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 3) && !java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 4)) {
                    logger.append("DEFAULT" + arg);
                    int expVal_8d839a8d88b640888e6c9084e646bd7f = i * 2;
                    if (java.util.Objects.equals(expVal_8d839a8d88b640888e6c9084e646bd7f, 7) || java.util.Objects.equals(expVal_8d839a8d88b640888e6c9084e646bd7f, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 1)) {
                    int expVal_8d839a8d88b640888e6c9084e646bd7f = i * 2;
                    if (java.util.Objects.equals(expVal_8d839a8d88b640888e6c9084e646bd7f, 7) || java.util.Objects.equals(expVal_8d839a8d88b640888e6c9084e646bd7f, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 3) || java.util.Objects.equals(expVal_917fc676b8ed46459cd2590cc69313de, 2)) {
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