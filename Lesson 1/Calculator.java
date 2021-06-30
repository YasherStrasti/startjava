public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        char operation = '%';
        if(operation == '+') {
            System.out.println(a + b);
        } else if (operation == '-') {
            System.out.println(a - b);
        } else if (operation == '/') {
            System.out.println(a / b);
        } else if (operation == '*') {
            System.out.println(a * b);
        } else if (operation == '%') {
            System.out.println(a % b);
        } else if (operation == '^') {
            int result = a;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}