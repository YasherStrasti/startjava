import java.util.Scanner;

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


        calculator.calculate();

        for () {
            System.out.print("Хотите продолжить игру?");
            String answer = scanner.next();

            if (answer == "yes") {
               CalculatorTest.initialization();
                calculator.calculate();
            }
        }
    }

    public void initialization() {
    }

}