public class Foo3_patched {
    public java.lang.String testSimpleExpression(int arg) {
        return switchMethod_e8499aa719334e218daca3139e7ce964(arg);
    }

    public java.lang.String testSimpleExpressionWithDoubleBrackets(int arg) {
        return switchMethod_5d9048410f7d499cb35690629964ebdb(arg);
    }

    public int testSimpleExpressionWithYields1(int input) {
        return switchMethod_69579d3e772e46cea91e9374768c8ba1(input);
    }

    public int testSimpleExpressionWithYields2(int input) {
        return switchMethod_dc27de609c044b58b4a365c0c8f46843(input);
    }

    public int testSimpleExpressionWithSomeYield(int input) {
        return switchMethod_87cea551abd843d29e42c9341921fe71(input);
    }

    public int testSimpleExpressionWithNested(int input) {
        return switchMethod_a4bb68eeab8541eaa8f0a81e5fbd6f32(input);
    }

    java.lang.String switchMethod_e8499aa719334e218daca3139e7ce964(int arg) {
        int expVal_55f8a0fcf03f44f5a68cee845276c135 = arg;
        if (java.util.Objects.equals(expVal_55f8a0fcf03f44f5a68cee845276c135, 1)) {
            return "one";
        } else if (java.util.Objects.equals(expVal_55f8a0fcf03f44f5a68cee845276c135, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    java.lang.String switchMethod_5d9048410f7d499cb35690629964ebdb(int arg) {
        int expVal_f17a4813668944da8a8ccf1c7376900b = arg;
        if (java.util.Objects.equals(expVal_f17a4813668944da8a8ccf1c7376900b, 1)) {
            {
                java.lang.System.out.println(1);
            }
            {
                return "one";
            }
        } else if (java.util.Objects.equals(expVal_f17a4813668944da8a8ccf1c7376900b, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    int switchMethod_0edd39d63dc14fe3884abe8bb040e071(int input) {
        int expVal_864352b3175242908bf7dc6fbd61aace = input;
        if (java.util.Objects.equals(expVal_864352b3175242908bf7dc6fbd61aace, 1)) {
            return 11;
        } else if (java.util.Objects.equals(expVal_864352b3175242908bf7dc6fbd61aace, 2)) {
            return 22;
        } else {
            return 33;
        }
    }

    int switchMethod_69579d3e772e46cea91e9374768c8ba1(int input) {
        int expVal_3c4f82485a75408bb6efc75d20571361 = input;
        if (!java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 0) && !java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 1) && !java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 2) && !java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 0) || java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 1)) {
            java.lang.System.out.println("test");
            return switchMethod_0edd39d63dc14fe3884abe8bb040e071(input);
        } else if (java.util.Objects.equals(expVal_3c4f82485a75408bb6efc75d20571361, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_dc27de609c044b58b4a365c0c8f46843(int input) {
        int expVal_180314b80c144ceebc1f709f0c2c95ff = input;
        if (!java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 0) && !java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 1) && !java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 2) && !java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 0) || java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 1)) {
            java.lang.System.out.println("test");
            return 1;
        } else if (java.util.Objects.equals(expVal_180314b80c144ceebc1f709f0c2c95ff, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_87cea551abd843d29e42c9341921fe71(int input) {
        int expVal_b5f5d697ee374cd194eafa06d5ebc15a = input;
        if (!java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 0) && !java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 1) && !java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 2) && !java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 3)) {
            return 0;
        } else if (java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 0) || java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_b5f5d697ee374cd194eafa06d5ebc15a, 2)) {
            return 2;
        } else {
            return 3;
        }
    }

    int switchMethod_46ace57310bd483796099ae1c87afd27(int input) {
        int expVal_f63aa375b9ba4268a5ace7cbf98bfffe = input;
        if (java.util.Objects.equals(expVal_f63aa375b9ba4268a5ace7cbf98bfffe, 7)) {
            return 27;
        } else if (java.util.Objects.equals(expVal_f63aa375b9ba4268a5ace7cbf98bfffe, 8)) {
            return 28;
        } else if (java.util.Objects.equals(expVal_f63aa375b9ba4268a5ace7cbf98bfffe, 9)) {
            return 29;
        } else {
            return 100;
        }
    }

    int switchMethod_4993783427924d318a62323b5febd590(int input) {
        int expVal_9e067ff865cf43e389da3141dd955b6e = input;
        if (java.util.Objects.equals(expVal_9e067ff865cf43e389da3141dd955b6e, 4)) {
            return 14;
        } else if (java.util.Objects.equals(expVal_9e067ff865cf43e389da3141dd955b6e, 5)) {
            return 15;
        } else if (java.util.Objects.equals(expVal_9e067ff865cf43e389da3141dd955b6e, 6)) {
            return 16;
        } else {
            return switchMethod_46ace57310bd483796099ae1c87afd27(input);
        }
    }

    int switchMethod_a4bb68eeab8541eaa8f0a81e5fbd6f32(int input) {
        int expVal_848a7be3df044715bcb760b355ce7ba5 = input;
        if (!java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 0) && !java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 1) && !java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 2) && !java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 3)) {
            return switchMethod_4993783427924d318a62323b5febd590(input);
        } else if (java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 0) || java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_848a7be3df044715bcb760b355ce7ba5, 2)) {
            return 2;
        } else {
            return 3;
        }
    }
}