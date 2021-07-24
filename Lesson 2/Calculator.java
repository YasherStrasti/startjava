public class Calculator {
    CalculatorTest calculatorTest = new CalculatorTest();
    public String calculate() {
        switch (calculatorTest.initialization()) {
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