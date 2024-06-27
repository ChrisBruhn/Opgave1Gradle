public class Calculator {

    int add(int a, int b) {
        return a+b;
    }

    int multiply(int a, int b) {
        return a*b;
    }

    int divide(int a, int b) {
        return a/b;
    }

    public int parseNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format");
        }
    }}
