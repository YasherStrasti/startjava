public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int n = 1; //степень
        int out = a;
        char ch = '%';
        if(ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '/') {
            System.out.println(a / b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '%') {
            System.out.println(a % b);
        } else if (ch == '^') {
            for (int i = 1; i <= n; i++) {
                out = out * a;
            }
            System.out.println(out);
        }
    }
}