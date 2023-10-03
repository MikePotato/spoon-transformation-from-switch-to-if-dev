public class Foo2 {
    public void testSimpleArrowCase(int input, StringBuilder sb) {
        switch (input) {
            default -> sb.append("DEFAULT");
            case 0, 1 -> sb.append(1);
            case 2 -> sb.append(2);
            case 3 -> sb.append(3);
        }
    }

    public void testSimpleArrowCaseWithNestedSwitch(int input, StringBuilder sb) {
        switch (input) {
            default -> {
                switch (input) {
                    case 4 -> sb.append("44");
                    case 5 -> sb.append("55");
                    default -> {
                        sb.append("too deep");
                        switch (input) {
                            case 6 -> sb.append("666");
                            case 7 -> sb.append("777");
                            default -> sb.append("default");
                        }
                    }
                }
            }
            case 0, 1 -> sb.append(1);
            case 2 -> sb.append(2);
            case 3 -> sb.append(3);
        }
    }

    public void testComplexArrowCase(int input, StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            switch (value) {
                case 1 -> {
                    sb.append("1_1");
                    sb.append("1_2");
                }
                case 2 -> sb.append("2");
                default -> sb.append("DEFAULT");
                case 3, 4 -> sb.append("3|4");
            }
        }
    }

    public void testComplexArrowCaseWithDoubleBrackets(int input, StringBuilder sb) {
        for (int value = 0; value < 10; value++) {
            switch (value) {
                case 1 -> {
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
                }
                case 2 -> {
                    sb.append("2");
                }
                default -> sb.append("DEFAULT");
                case 3, 4 -> sb.append("3|4");
            }
        }
    }
}
