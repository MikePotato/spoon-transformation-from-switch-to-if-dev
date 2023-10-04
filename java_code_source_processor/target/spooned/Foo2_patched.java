public class Foo2_patched {
    public void testSimpleArrowCase(int input, java.lang.StringBuilder sb) {
        {
            int expVal_6b2cadca8469487a9cce562a3992d6e8 = input;
            if (!java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 0) && !java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 1) && !java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 2) && !java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 3)) {
                sb.append("DEFAULT");
            } else if (java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 0) || java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_6b2cadca8469487a9cce562a3992d6e8, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testSimpleArrowCaseWithNestedSwitch(int input, java.lang.StringBuilder sb) {
        {
            int expVal_6900bd897bf1488086a5df40bb8edc2b = input;
            if (!java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 0) && !java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 1) && !java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 2) && !java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 3)) {
                {
                    int expVal_efee36d39e3a44328a4038adea072050 = input;
                    if (java.util.Objects.equals(expVal_efee36d39e3a44328a4038adea072050, 4)) {
                        sb.append("44");
                    } else if (java.util.Objects.equals(expVal_efee36d39e3a44328a4038adea072050, 5)) {
                        sb.append("55");
                    } else {
                        sb.append("too deep");
                        {
                            int expVal_2733a7241afe49958ef0a6925f9e541b = input;
                            if (java.util.Objects.equals(expVal_2733a7241afe49958ef0a6925f9e541b, 6)) {
                                sb.append("666");
                            } else if (java.util.Objects.equals(expVal_2733a7241afe49958ef0a6925f9e541b, 7)) {
                                sb.append("777");
                            } else {
                                sb.append("default");
                            }
                        }
                    }
                }
            } else if (java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 0) || java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_6900bd897bf1488086a5df40bb8edc2b, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testComplexArrowCase(int input, java.lang.StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            {
                int expVal_24255e73c27b416fb6b261cd9a8ad82d = value;
                if (java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 1)) {
                    sb.append("1_1");
                    sb.append("1_2");
                } else if (java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 1) && !java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 2) && !java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 3) && !java.util.Objects.equals(expVal_24255e73c27b416fb6b261cd9a8ad82d, 4)) {
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
                int expVal_5744ed8b981144bca0b078deee713467 = value;
                if (java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 1)) {
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
                } else if (java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 1) && !java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 2) && !java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 3) && !java.util.Objects.equals(expVal_5744ed8b981144bca0b078deee713467, 4)) {
                    sb.append("DEFAULT");
                } else {
                    sb.append("3|4");
                }
            }
        }
    }
}