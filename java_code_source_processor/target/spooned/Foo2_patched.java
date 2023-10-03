public class Foo2_patched {
    public void testSimpleArrowCase(int input, java.lang.StringBuilder sb) {
        {
            int expVal_7dd357861e3349c08cac5087ad04864a = input;
            if (!java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 0) && !java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 1) && !java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 2) && !java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 3)) {
                sb.append("DEFAULT");
            } else if (java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 0) || java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_7dd357861e3349c08cac5087ad04864a, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testSimpleArrowCaseWithNestedSwitch(int input, java.lang.StringBuilder sb) {
        {
            int expVal_fb92f79de33e4d059441b5c841b66329 = input;
            if (!java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 0) && !java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 1) && !java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 2) && !java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 3)) {
                {
                    int expVal_b200fcf540c44381ba4f4ffcb4a7158e = input;
                    if (java.util.Objects.equals(expVal_b200fcf540c44381ba4f4ffcb4a7158e, 4)) {
                        sb.append("44");
                    } else if (java.util.Objects.equals(expVal_b200fcf540c44381ba4f4ffcb4a7158e, 5)) {
                        sb.append("55");
                    } else {
                        sb.append("too deep");
                        {
                            int expVal_d6db4ff6136b4b5f91840c9ea9a74473 = input;
                            if (java.util.Objects.equals(expVal_d6db4ff6136b4b5f91840c9ea9a74473, 6)) {
                                sb.append("666");
                            } else if (java.util.Objects.equals(expVal_d6db4ff6136b4b5f91840c9ea9a74473, 7)) {
                                sb.append("777");
                            } else {
                                sb.append("default");
                            }
                        }
                    }
                }
            } else if (java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 0) || java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 1)) {
                sb.append(1);
            } else if (java.util.Objects.equals(expVal_fb92f79de33e4d059441b5c841b66329, 2)) {
                sb.append(2);
            } else {
                sb.append(3);
            }
        }
    }

    public void testComplexArrowCase(int input, java.lang.StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            {
                int expVal_f0bc357cfcf24be29ac0ebd1dc4f1442 = value;
                if (java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 1)) {
                    sb.append("1_1");
                    sb.append("1_2");
                } else if (java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 1) && !java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 2) && !java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 3) && !java.util.Objects.equals(expVal_f0bc357cfcf24be29ac0ebd1dc4f1442, 4)) {
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
                int expVal_59520933d0cb4530b4c9b4daca0c16ef = value;
                if (java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 1)) {
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
                } else if (java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 2)) {
                    sb.append("2");
                } else if (!java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 1) && !java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 2) && !java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 3) && !java.util.Objects.equals(expVal_59520933d0cb4530b4c9b4daca0c16ef, 4)) {
                    sb.append("DEFAULT");
                } else {
                    sb.append("3|4");
                }
            }
        }
    }
}