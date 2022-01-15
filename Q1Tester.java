public class Q1Tester {

        public static void main(String[] args) {

            System.out.println("== Test Case 1a ==");
            getSymbol_ReturnNotNull();

            System.out.println("\n== Test Case 1b ==");
            getSymbol_ReturnNull();

            System.out.println("\n== Test Case 2a ==");
            getOpChar_ReturnNotNull();

            System.out.println("\n== Test Case 2b ==");
            getOpChar_ReturnNull();

            System.out.println("\n== Test Case 3a ==");
            getOpStr_ReturnNotNull();

            System.out.println("\n== Test Case 3b ==");
            getOpStr_ReturnNull();

            System.out.println("\n== Test Case 4a ==");
            getKeyword_ReturnNotNull();

            System.out.println("\n== Test Case 4b ==");
            getKeyword_ReturnNull();

            System.out.println("\n== Test Case 5a ==");
            getKlingon_ReturnNotNull();

            System.out.println("\n== Test Case 5b ==");
            getKlingon_ReturnNull();

            System.out.println("\n== Test Case 6a ==");
            getLetter_ReturnTrue();

            System.out.println("\n== Test Case 6b ==");
            getLetter_ReturnFalse();

            System.out.println("\n== Test Case 7a ==");
            getDigit_ReturnTrue();

            System.out.println("\n== Test Case 7b ==");
            getDigit_ReturnFalse();

            System.out.println("\n== Test Case 8a ==");
            getWhiteSpace_ReturnTrue();

            System.out.println("\n== Test Case 8b ==");
            getWhiteSpace_ReturnFalse();

            System.out.println("\n== Test Case 9a ==");
            getLineBreak_ReturnTrue();

            System.out.println("\n== Test Case 9b ==");
            getLineBreak_ReturnFalse();


        }


        public static void getSymbol_ReturnNotNull() { // Test Case for non-null return cases of getSymbol

            Q1.TokenType t = Q1.getSymbol(',');
            System.out.println(t);
            System.out.println("Expect: " + Q1.TokenType.COMMA);
        }

    public static void getSymbol_ReturnNull() { // Test Case for Null return cases of getSymbol

        Q1.TokenType t = Q1.getSymbol('a');
        System.out.println(t);
        System.out.println("Expect: " + null);
    }

    public static void getOpChar_ReturnNotNull() { // Test Case for non-null return cases of getOperator character cases

            Q1.TokenType t = Q1.getOp('*');
            System.out.println(t);
            System.out.println("Expect: " + Q1.TokenType.OP_MULTIPLY);
    }

    public static void getOpChar_ReturnNull() { // Test Case for null return cases of getOperator character cases

            Q1.TokenType t = Q1.getOp('b');
            System.out.print(t);
            System.out.println("Expect: " + null);
    }

    public static void getOpStr_ReturnNotNull() { // Test Case for non-null return cases of getOperator string cases

        Q1.TokenType t = Q1.getOp(">=");
        System.out.println(t);
        System.out.println("Expect: " + Q1.TokenType.OP_GREATEREQUAL);
    }

    public static void getOpStr_ReturnNull() { // Test Case for null return cases of getOperator string cases

        Q1.TokenType t = Q1.getOp("ab");
        System.out.print(t);
        System.out.println("Expect: " + null);
    }

    public static void getKeyword_ReturnNotNull() { // Test Case for non-null Keyword cases

        Q1.TokenType t = Q1.getKeyword("If");
        System.out.println(t);
        System.out.println("Expect: " + Q1.TokenType.KEYWORD_IF);
    }

    public static void getKeyword_ReturnNull() { // Test Case for null return cases of Keyword cases

        Q1.TokenType t = Q1.getOp("bcd");
        System.out.print(t);
        System.out.println("Expect: " + null);
    }

    public static void getKlingon_ReturnNotNull() { // Test Case for non-null Klingon cases

        Q1.TokenType t = Q1.getKlingon("rltlh");
        System.out.println(t);
        System.out.println("Expect: " + Q1.TokenType.KLINGON_PRINT);
    }

    public static void getKlingon_ReturnNull() { // Test Case for null return cases of Klingon cases

        Q1.TokenType t = Q1.getKlingon("bcdes");
        System.out.print(t);
        System.out.println("Expect: " + null);
    }

    public static void getLetter_ReturnTrue() { // Test true for true return letter cases

        boolean t = Q1.isLetter('b');
        System.out.println(t);
        System.out.println("Expect: " + true);
    }

    public static void getLetter_ReturnFalse() { // Test Case for false return cases of letter cases

        boolean t = Q1.isLetter('$');
        System.out.println(t);
        System.out.println("Expect: " + false);
        }

    public static void getDigit_ReturnTrue() { // Test true for true return digit cases

        boolean t = Q1.isDigit('9');
        System.out.println(t);
        System.out.println("Expect: " + true);
    }

    public static void getDigit_ReturnFalse() { // Test Case for false return cases of digit cases

        boolean t = Q1.isDigit('!');
        System.out.println(t);
        System.out.println("Expect: " + false);
    }

    public static void getWhiteSpace_ReturnTrue() { // Test true for true return whitespaces cases

        boolean t = Q1.isWhiteSpace(' ');
        System.out.println(t);
        System.out.println("Expect: " + true);
    }

    public static void getWhiteSpace_ReturnFalse() { // Test Case for false return cases of whitespace cases

        boolean t = Q1.isWhiteSpace('!');
        System.out.println(t);
        System.out.println("Expect: " + false);
    }

    public static void getLineBreak_ReturnTrue() { // Test true for true return linebreak cases

        boolean t = Q1.isLineBreak('\n');
        System.out.println(t);
        System.out.println("Expect: " + true);
    }

    public static void getLineBreak_ReturnFalse() { // Test Case for false return cases of linebreak cases

        boolean t = Q1.isLineBreak(' ');
        System.out.println(t);
        System.out.println("Expect: " + false);
    }







}
