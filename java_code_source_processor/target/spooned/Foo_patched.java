public class Foo_patched {
    public void testFromTask(int input, java.lang.StringBuilder logger) {
        logger.append("BEFORE");
        for (int x = 0; x < 10; x++) {
            {
                int expVal_0755a89d63ce419aad32389d767f9d91 = input;
                if (java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 0)) {
                    logger.append(input);
                    return;
                } else if (!java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 0) && !java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 6) && !java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 3) && !java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 1)) {
                    logger.append("DEFAULT");
                    logger.append(2);
                    logger.append(input);
                    continue;
                } else if (java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 3) || java.util.Objects.equals(expVal_0755a89d63ce419aad32389d767f9d91, 6)) {
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
            java.lang.String expVal_cd5d361233904201aa5513af2fd8f0d7 = getValue(logger);
        }
    }

    public int testColonSwitchWithReturns(int arg, java.lang.StringBuilder logger) {
        for (int i = 0; i < 10; i++) {
            {
                int expVal_04c8b9b605594a41b473d7d8f07e8219 = arg;
                if (java.util.Objects.equals(expVal_04c8b9b605594a41b473d7d8f07e8219, 1) || java.util.Objects.equals(expVal_04c8b9b605594a41b473d7d8f07e8219, 0)) {
                    logger.append(1);
                    return 1;
                } else if (java.util.Objects.equals(expVal_04c8b9b605594a41b473d7d8f07e8219, 2)) {
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
            java.lang.String expVal_0509e0f4e6854023ad2c81b524e81f2d = arg;
            if (java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "1") || java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "0")) {
                logger.append(1);
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "2")) {
                logger.append(2);
                logger.append("default");
                logger.append(3);
            } else if (!java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "0") && !java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "1") && !java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "2") && !java.util.Objects.equals(expVal_0509e0f4e6854023ad2c81b524e81f2d, "3")) {
                logger.append("default");
                logger.append(3);
            } else {
                logger.append(3);
            }
        }
    }

    public void testMostPrimitiveCase2(java.lang.String arg, java.lang.StringBuilder logger) {
        {
            java.lang.String expVal_d11264d4f380407b88e6a0d5f9a73cb0 = arg;
            if (java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "1") || java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "0")) {
                logger.append(1);
                logger.append("default");
                logger.append(3);
            } else if ((!java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "0") && !java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "1") && !java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "2") && !java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "3")) || java.util.Objects.equals(expVal_d11264d4f380407b88e6a0d5f9a73cb0, "2")) {
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
                int expVal_4498918e06254d0288210a1913134b55 = i;
                if (!java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 1) && !java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 2) && !java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 3) && !java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 4)) {
                    logger.append("DEFAULT" + arg);
                    int expVal_388743b43cd64e279e0e811f9550e209 = i * 2;
                    if (java.util.Objects.equals(expVal_388743b43cd64e279e0e811f9550e209, 7) || java.util.Objects.equals(expVal_388743b43cd64e279e0e811f9550e209, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 1)) {
                    int expVal_388743b43cd64e279e0e811f9550e209 = i * 2;
                    if (java.util.Objects.equals(expVal_388743b43cd64e279e0e811f9550e209, 7) || java.util.Objects.equals(expVal_388743b43cd64e279e0e811f9550e209, 6)) {
                        {
                            for (; ;) {
                                break;
                            }
                            i = 4;
                            // break;
                        }
                    }
                    logger.append("1");
                } else if (java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 3) || java.util.Objects.equals(expVal_4498918e06254d0288210a1913134b55, 2)) {
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