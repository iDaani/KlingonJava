import java.awt.desktop.PreferencesEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q2 {

    public enum TokenType {OP_MULTIPLY, OP_DIVIDE, OP_MOD, OP_ADD, OP_SUBTRACT, OP_LESS, OP_LESSEQUAL,
        OP_GREATER, OP_GREATEREQUAL, OP_EQUAL, OP_NOTEQUAL, OP_ASSIGN, LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE,
        RIGHT_BRACE, LEFT_BRACKET, RIGHT_BRACKET, SEMICOLON, COMMA, KEYWORD_IF, KEYWORD_ELSE, KEYWORD_INT,
        KEYWORD_STRING, KEYWORD_PUBLIC, KEYWORD_CLASS, KEYWORD_VOID, KEYWORD_STATIC, IDENTIFIER, INTEGER, STRING,
        KLINGON_PRINT, KLINGON_ADD, KLINGON_SUBTRACT, KLINGON_MULTIPLY, KLINGON_DIVIDE} // Enums

    public static TokenType getOp(char ch) { // Method to return which Klingon Operator (single char) is being used

        TokenType t = null;

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
            return t;
        }
    }

    public static TokenType getOp(String s) {  // Method to return which Klingon Operator (double char for String) is being used

        TokenType t = null;

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
            return t;
        }
    }

    public static TokenType getSymbol(char ch) { // Method to return which Klingon Symbol is being used

        TokenType t = null;

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
            return t;
        }
    }

    public static TokenType getKeyword (String s) { // Method to return which Klingon Keyword  is being used

        TokenType t = null;

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
            return t;
        }
    }

    public static TokenType getKlingon(String s) { // Method to return which Klingon Method is being used

        TokenType t = null;

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
            return t;
        }
    }

    public static boolean isLetter(char ch) {
        String check = "abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ";

        return check.contains(Character.toString(ch)); // Converts char to string and then check if its part of the larger string
    }

    public static boolean isDigit(char ch) {
        String check = "0123456789";

        return check.contains(Character.toString(ch)); // Converts char to string and then checks if its part of the bigger string
    }

    public static boolean isWhiteSpace (char ch) {
        if (ch == ' ') {
            return true;
        } else if (ch == '\t') {
            return true;
        } else return false;
    }

    public static boolean isLineBreak (char ch) {
        if (Character.toString(ch).equals("\n")) { // Converts char to string and checks if its a linebreak
            return true;
        } else {
            return false;
        }
    }






    public static String readFile2String(String fname) { // Used to read the file
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(fname)));
        } catch (IOException e) {
            System.out.println("Fail to read a file");
        }
        return content;
    }






    public static void scan(String prog) { // Used to scan through the text of the file
        int n = prog.length();
        int index = 0;
        int lineNumber = 1;

        while (index < n) {

            char ch = prog.charAt(index);

            boolean whiteSpace = isWhiteSpace(ch);

            boolean newLine = isLineBreak(ch);

            TokenType sym = getSymbol(ch);
            TokenType op = getOp(ch);
            boolean letter = isLetter(ch);
            boolean digit = isDigit(ch);

            if(whiteSpace) { // Checks if character is a whitespace and skips it
                index++;
                continue;
            }
            else if (newLine) { // Checks if character is a linebreak and skips it
                lineNumber++;
                index++;
                continue;
            }

            else if (sym != null) { // Checks for symbols
                System.out.println(lineNumber + ", " + sym + ", " + ch);
                index++;
                continue;
            }

            else if (op!= null) { // Checks for operators

                if (ch == '=' || ch == '!' || ch == '>' || ch == '<') { // Checks for >=, <=, != and == - double character operators

                    if (prog.charAt(index + 1) == '=') {
                        String s = "";
                        s += prog.charAt(index);
                        s += prog.charAt(index+1);
                        System.out.println(lineNumber + ", " + getOp(s) + ", " + s);
                        index++;
                        index++;
                        continue;
                    } else {
                        System.out.println(lineNumber + ", " + op + ", " + ch); // Prints other single character operators
                        index++;
                        continue;
                    }
                }

                else {
                    System.out.println(lineNumber + ", " + op + ", " + ch); // Prints single character operators
                    index++;
                    continue;
                }

            }

            else if (letter) { // Checks for letters
                String word = "";
                word+=ch;
                index++;

                while (index < n) {
                    ch = prog.charAt(index);
                    if (isLetter(ch)) {
                        word += ch;
                        index++;
                        continue;
                    } else {
                        break;
                    }
                }

                TokenType keyword = getKeyword(word);
                TokenType klingon = getKlingon(word);
                if (keyword != null) { // Checks for Klingon keywords
                    System.out.println(lineNumber + ", " + keyword + ", " + word);
                } else if (klingon != null) { // Checks for Klingon
                    System.out.println(lineNumber + ", " + klingon + ", " + word);
                }
                else { // Prints letters otherwise
                    System.out.println(lineNumber + ", " + TokenType.STRING + ", " + word);
                }





                continue;
            }

            else if (digit) { // Checks for integers (numbers)
                String number = "";
                number += ch;
                index++;

                while (index < n) {
                    ch = prog.charAt(index);
                    if (isDigit(ch)) {
                        number += ch;
                        index++;
                    } else {
                        break;
                    }
                }

                System.out.println(lineNumber + ", " + TokenType.INTEGER + ", " + number);
                continue;

            }

            else if (ch == '\"') { // Checks for strings
                String str = "";
                str += ch;
                index++;

                while (index < n) {
                    ch = prog.charAt(index);
                    str += ch;
                    if (ch == '\"') {
                       break;
                    }
                    index++;
                }

                System.out.println(lineNumber + ", " + TokenType.STRING + ", " +  str);
                index++;
                continue;

            }

            else { // Prints default value if none of the above matches the type of character

                System.out.println("Encountered something not expected: " + ch);
                index++;
                continue;

            }




        }




    }




    public static void main(String[] args) {

        String prog = readFile2String("src/KlingonExample.txt");
        scan(prog);

    }




}
