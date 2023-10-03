public class Foo3_patched {
    public java.lang.String testSimpleExpression(int arg) {
        return switchMethod_5caed8ebcb8047d1a71d6f5d92e9b735(arg);
    }

    public java.lang.String testSimpleExpressionWithDoubleBrackets(int arg) {
        return switchMethod_465ccba4312144bc86394f8c5c9e4149(arg);
    }

    public int testSimpleExpressionWithYields1(int input) {
        return switchMethod_579de7c749e64d5aa7b164d967724db3(input);
    }

    public int testSimpleExpressionWithYields2(int input) {
        return switchMethod_e8ac9a5d8d234ba88b8ffe9c59605d1c(input);
    }

    public int testSimpleExpressionWithSomeYield(int input) {
        return switchMethod_a2d74397e1654c698fd778f121717ea4(input);
    }

    public int testSimpleExpressionWithNested(int input) {
        return switchMethod_a583350de77e439a9930f110a835ec78(input);
    }

    java.lang.String switchMethod_5caed8ebcb8047d1a71d6f5d92e9b735(int arg) {
        int expVal_3ffca62cb2e34f178eae3feb1240d940 = arg;
        if (java.util.Objects.equals(expVal_3ffca62cb2e34f178eae3feb1240d940, 1)) {
            return "one";
        } else if (java.util.Objects.equals(expVal_3ffca62cb2e34f178eae3feb1240d940, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    java.lang.String switchMethod_465ccba4312144bc86394f8c5c9e4149(int arg) {
        int expVal_fb3047fa302f4543aff530469c3bb17f = arg;
        if (java.util.Objects.equals(expVal_fb3047fa302f4543aff530469c3bb17f, 1)) {
            {
                java.lang.System.out.println(1);
            }
            {
                return "one";
            }
        } else if (java.util.Objects.equals(expVal_fb3047fa302f4543aff530469c3bb17f, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    int switchMethod_98336c8b99c841609ce6c00fa2aac618(int input) {
        int expVal_ac3597d15c1d47b9a5141580fe69cda8 = input;
        if (java.util.Objects.equals(expVal_ac3597d15c1d47b9a5141580fe69cda8, 1)) {
            return 11;
        } else if (java.util.Objects.equals(expVal_ac3597d15c1d47b9a5141580fe69cda8, 2)) {
            return 22;
        } else {
            return 33;
        }
    }

    int switchMethod_579de7c749e64d5aa7b164d967724db3(int input) {
        int expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f = input;
        if (!java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 0) && !java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 1) && !java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 2) && !java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 0) || java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 1)) {
            java.lang.System.out.println("test");
            return switchMethod_98336c8b99c841609ce6c00fa2aac618(input);
        } else if (java.util.Objects.equals(expVal_fa7846188a3e409fb5d1f8dfcdc8aa8f, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_e8ac9a5d8d234ba88b8ffe9c59605d1c(int input) {
        int expVal_e32125cd91a54296b3d45ecc0096d242 = input;
        if (!java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 0) && !java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 1) && !java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 2) && !java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 0) || java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 1)) {
            java.lang.System.out.println("test");
            return 1;
        } else if (java.util.Objects.equals(expVal_e32125cd91a54296b3d45ecc0096d242, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_a2d74397e1654c698fd778f121717ea4(int input) {
        int expVal_25154c45efee467bbfdf2369b71771d4 = input;
        if (!java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 0) && !java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 1) && !java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 2) && !java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 3)) {
            return 0;
        } else if (java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 0) || java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_25154c45efee467bbfdf2369b71771d4, 2)) {
            return 2;
        } else {
            return 3;
        }
    }

    int switchMethod_1043eabd86e04614ab138d77f2cc9269(int input) {
        int expVal_19177512362c4969a637a722d3db9d65 = input;
        if (java.util.Objects.equals(expVal_19177512362c4969a637a722d3db9d65, 7)) {
            return 27;
        } else if (java.util.Objects.equals(expVal_19177512362c4969a637a722d3db9d65, 8)) {
            return 28;
        } else if (java.util.Objects.equals(expVal_19177512362c4969a637a722d3db9d65, 9)) {
            return 29;
        } else {
            return 100;
        }
    }

    int switchMethod_cd9b39a84c7048c2be2e9795638cea8e(int input) {
        int expVal_23e84a34037841e098298a8e8cf9a78f = input;
        if (java.util.Objects.equals(expVal_23e84a34037841e098298a8e8cf9a78f, 4)) {
            return 14;
        } else if (java.util.Objects.equals(expVal_23e84a34037841e098298a8e8cf9a78f, 5)) {
            return 15;
        } else if (java.util.Objects.equals(expVal_23e84a34037841e098298a8e8cf9a78f, 6)) {
            return 16;
        } else {
            return switchMethod_1043eabd86e04614ab138d77f2cc9269(input);
        }
    }

    int switchMethod_a583350de77e439a9930f110a835ec78(int input) {
        int expVal_e332bbb8aab04a4eabf8a89cf593eb33 = input;
        if (!java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 0) && !java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 1) && !java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 2) && !java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 3)) {
            return switchMethod_cd9b39a84c7048c2be2e9795638cea8e(input);
        } else if (java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 0) || java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_e332bbb8aab04a4eabf8a89cf593eb33, 2)) {
            return 2;
        } else {
            return 3;
        }
    }
}