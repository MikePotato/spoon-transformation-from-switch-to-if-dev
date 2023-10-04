public class Foo3_patched {
    public java.lang.String testSimpleExpression(int arg) {
        return switchMethod_372d60bb1a1849e99758ef9efc5db708(arg);
    }

    public java.lang.String testSimpleExpressionWithDoubleBrackets(int arg) {
        return switchMethod_d397dd430ef644acab65ec142eb1cdc9(arg);
    }

    public int testSimpleExpressionWithYields1(int input) {
        return switchMethod_4c6ba452a29547f9b92c418107b9891d(input);
    }

    public int testSimpleExpressionWithYields2(int input) {
        return switchMethod_462152286f184f4ba8d487152c6917f7(input);
    }

    public int testSimpleExpressionWithSomeYield(int input) {
        return switchMethod_93d24251a24741c0acb5cc227b849311(input);
    }

    public int testSimpleExpressionWithNested(int input) {
        return switchMethod_9d97940611ef496da453e76411180f1b(input);
    }

    java.lang.String switchMethod_372d60bb1a1849e99758ef9efc5db708(int arg) {
        int expVal_7ee2e810126443c6a95cf0395c4ccafe = arg;
        if (java.util.Objects.equals(expVal_7ee2e810126443c6a95cf0395c4ccafe, 1)) {
            return "one";
        } else if (java.util.Objects.equals(expVal_7ee2e810126443c6a95cf0395c4ccafe, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    java.lang.String switchMethod_d397dd430ef644acab65ec142eb1cdc9(int arg) {
        int expVal_3ed1bd253c904831883a80a2d7c77b6a = arg;
        if (java.util.Objects.equals(expVal_3ed1bd253c904831883a80a2d7c77b6a, 1)) {
            {
                java.lang.System.out.println(1);
            }
            {
                return "one";
            }
        } else if (java.util.Objects.equals(expVal_3ed1bd253c904831883a80a2d7c77b6a, 2)) {
            return "two";
        } else {
            return "many";
        }
    }

    int switchMethod_9d6289269f094875afe388a92955c973(int input) {
        int expVal_794d8976100c4c0dbbb1822c97218e08 = input;
        if (java.util.Objects.equals(expVal_794d8976100c4c0dbbb1822c97218e08, 1)) {
            return 11;
        } else if (java.util.Objects.equals(expVal_794d8976100c4c0dbbb1822c97218e08, 2)) {
            return 22;
        } else {
            return 33;
        }
    }

    int switchMethod_4c6ba452a29547f9b92c418107b9891d(int input) {
        int expVal_476f5669708b4623a590a7b6bbaf5001 = input;
        if (!java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 0) && !java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 1) && !java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 2) && !java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 0) || java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 1)) {
            java.lang.System.out.println("test");
            return switchMethod_9d6289269f094875afe388a92955c973(input);
        } else if (java.util.Objects.equals(expVal_476f5669708b4623a590a7b6bbaf5001, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_462152286f184f4ba8d487152c6917f7(int input) {
        int expVal_32158c677cde489a8c704f16d0998f6b = input;
        if (!java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 0) && !java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 1) && !java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 2) && !java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 3)) {
            java.lang.System.out.println("test");
            return 0;
        } else if (java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 0) || java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 1)) {
            java.lang.System.out.println("test");
            return 1;
        } else if (java.util.Objects.equals(expVal_32158c677cde489a8c704f16d0998f6b, 2)) {
            java.lang.System.out.println("test");
            return 2;
        } else {
            java.lang.System.out.println("test");
            return 3;
        }
    }

    int switchMethod_93d24251a24741c0acb5cc227b849311(int input) {
        int expVal_0a98a4245a4b4ae8a12738c0d209e9fb = input;
        if (!java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 0) && !java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 1) && !java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 2) && !java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 3)) {
            return 0;
        } else if (java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 0) || java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_0a98a4245a4b4ae8a12738c0d209e9fb, 2)) {
            return 2;
        } else {
            return 3;
        }
    }

    int switchMethod_69e8b9f85b7f44388c188cade318954d(int input) {
        int expVal_aee32e4ea3044b7abecfce341c831bd7 = input;
        if (java.util.Objects.equals(expVal_aee32e4ea3044b7abecfce341c831bd7, 7)) {
            return 27;
        } else if (java.util.Objects.equals(expVal_aee32e4ea3044b7abecfce341c831bd7, 8)) {
            return 28;
        } else if (java.util.Objects.equals(expVal_aee32e4ea3044b7abecfce341c831bd7, 9)) {
            return 29;
        } else {
            return 100;
        }
    }

    int switchMethod_5e30616a992d408ab63903bd6f577d12(int input) {
        int expVal_d2f699ad9868424888a02cdf4d58ceb7 = input;
        if (java.util.Objects.equals(expVal_d2f699ad9868424888a02cdf4d58ceb7, 4)) {
            return 14;
        } else if (java.util.Objects.equals(expVal_d2f699ad9868424888a02cdf4d58ceb7, 5)) {
            return 15;
        } else if (java.util.Objects.equals(expVal_d2f699ad9868424888a02cdf4d58ceb7, 6)) {
            return 16;
        } else {
            return switchMethod_69e8b9f85b7f44388c188cade318954d(input);
        }
    }

    int switchMethod_9d97940611ef496da453e76411180f1b(int input) {
        int expVal_d3a9a0df464547699091783fc43faa0b = input;
        if (!java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 0) && !java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 1) && !java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 2) && !java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 3)) {
            return switchMethod_5e30616a992d408ab63903bd6f577d12(input);
        } else if (java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 0) || java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 1)) {
            return 1;
        } else if (java.util.Objects.equals(expVal_d3a9a0df464547699091783fc43faa0b, 2)) {
            return 2;
        } else {
            return 3;
        }
    }
}