public class Calculator {
    CalculatorTest calculatorTest = new CalculatorTest();

    public String mathAnswer() {
        switch (calculatorTest.operation) {
            case "+":
                System.out.println(calculatorTest.a * calculatorTest.b);
            break;
//            case '-':
//                System.out.println(a - b);
//            break;
//            case '*':
//                System.out.println(a * b);
//            break;
//            case '/':
//                System.out.println(a / b);
//            break;
//            case '%':
//                System.out.println(a % b);
//            break;
//            case '^':
//                int result = a;
//                for (int i = 1; i <= b; i++) {
//                    result *= a;
//                }
//                System.out.println(result);
//                break;
        }
    }
}