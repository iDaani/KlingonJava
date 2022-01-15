import java.awt.desktop.PreferencesEvent;

public class Q1 {

    public enum TokenType {OP_MULTIPLY, OP_DIVIDE, OP_MOD, OP_ADD, OP_SUBTRACT, OP_LESS, OP_LESSEQUAL,
    OP_GREATER, OP_GREATEREQUAL, OP_EQUAL, OP_NOTEQUAL, OP_ASSIGN, LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE,
    RIGHT_BRACE, LEFT_BRACKET, RIGHT_BRACKET, SEMICOLON, COMMA, KEYWORD_IF, KEYWORD_ELSE, KEYWORD_INT,
    KEYWORD_STRING, KEYWORD_PUBLIC, KEYWORD_CLASS, KEYWORD_VOID, KEYWORD_STATIC, IDENTIFIER, INTEGER, STRING,
    KLINGON_PRINT, KLINGON_ADD, KLINGON_SUBTRACT, KLINGON_MULTIPLY, KLINGON_DIVIDE} // Enums

    public static void main(String[] args) {

        TokenType op1 = getOp('+');
        System.out.println("op1: " + op1);

        TokenType op2 = getOp("==");
        System.out .println("op2: " + op2);

        TokenType sym = getSymbol('{');
        System.out .println("symbol: " + sym);

        TokenType keyword = getKeyword("int");
        System.out .println("keyword: " + keyword);

        TokenType klingon = getKlingon("rltlh");
        System.out .println("klingon: " + klingon);

        boolean letter = isLetter('a');
        System.out .println("letter: " + letter);

        boolean digit = isDigit('0');
        System.out .println("digit: " + digit);

        boolean whiteSpace = isWhiteSpace(' ');
        System.out .println("whiteSpace: " + whiteSpace);

        boolean newline = isLineBreak('\n');
        System.out .println("newline: " + newline);


    }

    public static TokenType getOp(char ch) { // Method to return which Klingon Operator (single char) is being used

        if (ch == '*') {       // Checks for multiplication
            return TokenType.OP_MULTIPLY;
        }

        else if (ch == '/') {   // Checks for division
            return TokenType.OP_DIVIDE;
        }

        else if (ch == '%') {   // Checks for MOD
            return TokenType.OP_MOD;
        }

        else if (ch == '+') {  // Checks for addition
            return TokenType.OP_ADD;
        }

        else if (ch == '-') {  // Checks for subtraction
            return TokenType.OP_SUBTRACT;
        }

        else if (ch == '<') { // Checks for less than
            return TokenType.OP_LESS;
        }

        else if (ch == '>') {  // Checks for greater than
            return TokenType.OP_GREATER;
        }

        else if (ch == '=') {  // Checks for assign
            return TokenType.OP_ASSIGN;
        }

        else {   // Returns default value if none of the above
            return null;
        }
    }

    public static TokenType getOp(String s) {  // Method to return which Klingon Operator (double char for String) is being used

        if (s.equals("<=")) {  // Checks for less than or equal to
            return TokenType.OP_LESSEQUAL;
        }

        else if (s.equals(">=")) {   // Checks for greater than or equal to
            return TokenType.OP_GREATEREQUAL;
        }

        else if (s.equals("==")) {  // Checks for equal
            return TokenType.OP_EQUAL;
        }

        else if (s.equals("!=")) {  // Checks for not equal
            return TokenType.OP_NOTEQUAL;
        }

        else {  // Returns default value if none of the above
            return null;
        }
    }

    public static TokenType getSymbol(char ch) { // Method to return which Klingon Symbol is being used

        if (ch == '(') {  // Checks for left parenthesis
            return TokenType.LEFT_PAREN;
        }

        else if (ch == ')') {   // Checks for right parenthesis
            return TokenType.RIGHT_PAREN;
        }

        else if (ch == '{') {  // Checks for left curly bracket (brace)
            return TokenType.LEFT_BRACE;
        }

        else if (ch == '}') {  // Checks for right curly bracket (brace)
            return TokenType.RIGHT_BRACE;
        }

        else if (ch == '[') { // Checks for left bracket
            return TokenType.LEFT_BRACKET;
        }

        else if (ch == ']') {  // Checks for right bracket
            return TokenType.RIGHT_BRACKET;
        }

        else if (ch == ';') { // Checks for semi-colon
            return TokenType.SEMICOLON;
        }

        else if (ch == ',') { // Checks for comma
            return TokenType.COMMA;
        }

        else { // Returns the default value if none of the above
            return null;
        }
    }

    public static TokenType getKeyword (String s) { // Method to return which Klingon Keyword  is being used

        if (s.equals("If")) { // Checks for 'if'
            return TokenType.KEYWORD_IF;
        }

        else if (s.equals("else")) { // Checks for 'else'
            return TokenType.KEYWORD_ELSE;
        }

        else if (s.equals("int")) { // Checks for 'int'
            return TokenType.KEYWORD_INT;
        }

        else if (s.equals("String")) { // Checks for 'String'
            return TokenType.KEYWORD_STRING;
        }

        else if (s.equals("public")) { // Checks for 'public'
            return TokenType.KEYWORD_PUBLIC;
        }

        else if(s.equals("class")) { // Checks for 'class'
            return TokenType.KEYWORD_CLASS;
        }

        else if (s.equals("void")) { // Checks for 'void'
            return TokenType.KEYWORD_VOID;
        }

        else if (s.equals("static")) { // Checks for 'static'
            return TokenType.KEYWORD_STATIC;
        }

        else {  // Returns the default value if none of the above
            return null;
        }
    }

    public static TokenType getKlingon(String s) { // Method to return which Klingon Method is being used

        if (s.equals("rltlh")) {  // Checks for 'rltlh' - AKA print
            return TokenType.KLINGON_PRINT;
        }

        else if (s.equals("boq")) {  // Checks for 'boq' - AKA add
            return TokenType.KLINGON_ADD;
        }

        else if (s.equals("boqha")) { // Checks for 'boqha' - AKA subtract
            return TokenType.KLINGON_SUBTRACT;
        }

        else if (s.equals("boqegh")) { // Checks for 'boqegh' - AKA multiply
            return TokenType.KLINGON_MULTIPLY;
        }

        else if (s.equals("boqHaegh")) { // Checks for 'boqHaegh' - AKA divide
            return TokenType.KLINGON_DIVIDE;
        }

        else { // Returns the default value if none of the above
            return null;
        }
    }

    public static boolean isLetter(char ch) {
        switch(ch) { // Checks if it's an alphabet
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return true;
            default: // Returns false else if not a letter
                return false;
        }
    }

    public static boolean isDigit(char ch) {
        switch(ch){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default: return false; // Return false if number is not from 0-9
        }

    }

    public static boolean isWhiteSpace (char ch) {
        return Character.isWhitespace(ch); // Checks if char is a whitespace
    }

    public static boolean isLineBreak (char ch) {
        if (Character.toString(ch).equals("\n")) { // Converts char to string and checks if its a linebreak
            return true;
        } else {
            return false;
        }
    }


}
