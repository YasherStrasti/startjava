public class Calculator {
    public void calculate(int a, String operation, int b) {
        switch (operation) {
            case "+":
                System.out.println(a * b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
            break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            case "^":
                int result = a;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(result);
                break;
        }
    }
}