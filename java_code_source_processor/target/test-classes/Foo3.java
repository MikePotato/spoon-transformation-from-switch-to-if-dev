public class Foo3 {
    public String testSimpleExpression(int arg){
        return switch(arg) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "many";
        };
    }

    public String testSimpleExpressionWithDoubleBrackets(int arg){
        return switch(arg) {
            case 1 -> {
                {
                    System.out.println(1);
                }
                {
                    yield "one";
                }
            }
            case 2 -> "two";
            default -> "many";
        };
    }

    public int testSimpleExpressionWithYields1(int input) {
        return switch (input) {
            default : { System.out.println("test"); yield 0; }
            case 0, 1 : { System.out.println("test"); yield switch(input) {
                case 1 -> 11;
                case 2 -> 22;
                default -> 33;
            }; }
            case 2 : { System.out.println("test"); yield 2; }
            case 3 : { System.out.println("test"); yield 3; }
        };
    }

    public int testSimpleExpressionWithYields2(int input) {
        return switch (input) {
            default -> { System.out.println("test"); yield 0; }
            case 0, 1 -> { System.out.println("test"); yield 1; }
            case 2 -> { System.out.println("test"); yield 2; }
            case 3 -> { System.out.println("test"); yield 3; }
        };
    }

    public int testSimpleExpressionWithSomeYield(int input) {
        return switch (input) {
            default -> { yield  0; }
            case 0, 1 -> 1;
            case 2 -> 2;
            case 3 -> { yield 3; }
        };
    }

    public int testSimpleExpressionWithNested(int input) {
        return switch (input) {
            default -> switch (input) {
                case 4 -> 14;
                case 5 -> 15;
                case 6 -> 16;
                default -> switch (input) {
                    case 7 -> 27;
                    case 8 -> 28;
                    case 9 -> 29;
                    default -> 100;
                };
            };
            case 0, 1 -> 1;
            case 2 -> 2;
            case 3 -> { yield 3; }
        };
    }
}
