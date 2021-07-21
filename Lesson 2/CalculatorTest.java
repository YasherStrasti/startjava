public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите знак математической операции: ");
        String operation = scanner.next();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        calculator.mathAnswer();

        System.out.print("Хотите продолжить вычисления? ");
        String answer = scanner.next();
        switch(answer) {
            case "yes":
                calculator.mathAnswer();
                break;
            case "no":
                break;
            default:

        }
    }
}