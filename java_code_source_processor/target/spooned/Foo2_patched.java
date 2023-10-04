public class Foo2_patched {
    public void testSimpleArrowCase(int input, java.lang.StringBuilder sb) {
        {
            int expVal_23d35fc6f41645ca99b4f978ad745a79 = input;
            if (!java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 0) && !java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 1) && !java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 2) && !java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 3)) {
                sb.append("DEFAULT");
            } else if (java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 0) || java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_23d35fc6f41645ca99b4f978ad745a79, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testSimpleArrowCaseWithNestedSwitch(int input, java.lang.StringBuilder sb) {
        {
            int expVal_84edbf32ba8b4e8aa0136a9736c3c75c = input;
            if (!java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 0) && !java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 1) && !java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 2) && !java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 3)) {
                {
                    int expVal_095198908db84161957061fdce2fe80a = input;
                    if (java.util.Objects.equals(expVal_095198908db84161957061fdce2fe80a, 4)) {
                        sb.append("44");
                    } else if (java.util.Objects.equals(expVal_095198908db84161957061fdce2fe80a, 5)) {
                        sb.append("55");
                    } else {
                        sb.append("too deep");
                        {
                            int expVal_7e9833fcaeac4d23ba269b9b66c12d06 = input;
                            if (java.util.Objects.equals(expVal_7e9833fcaeac4d23ba269b9b66c12d06, 6)) {
                                sb.append("666");
                            } else if (java.util.Objects.equals(expVal_7e9833fcaeac4d23ba269b9b66c12d06, 7)) {
                                sb.append("777");
                            } else {
                                sb.append("default");
                            }
                        }
                    }
                }
            } else if (java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 0) || java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_84edbf32ba8b4e8aa0136a9736c3c75c, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testComplexArrowCase(int input, java.lang.StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            {
                int expVal_9df073b74757446bb78ab17b93960348 = value;
                if (java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 1)) {
                    sb.append("1_1");
                    sb.append("1_2");
                } else if (java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 1) && !java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 2) && !java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 3) && !java.util.Objects.equals(expVal_9df073b74757446bb78ab17b93960348, 4)) {
                    sb.append("DEFAULT");
                } else {
                    sb.append("3|4");
                }
            }
        }
    }

    public void testComplexArrowCaseWithDoubleBrackets(int input, java.lang.StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            {
                int expVal_bcc060d410334b1aa5d0ca5ce471176d = value;
                if (java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 1)) {
                    {
                        sb.append("1_1");
                        sb.append("1_2");
                    }
                    {
                        {
                            sb.append("1_2");
                            sb.append("1_3");
                        }
                    }
                } else if (java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 1) && !java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 2) && !java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 3) && !java.util.Objects.equals(expVal_bcc060d410334b1aa5d0ca5ce471176d, 4)) {
                    sb.append("DEFAULT");
                } else {
                    sb.append("3|4");
                }
            }
        }
    }
}