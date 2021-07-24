import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите знак математической операции: ");
            String operation = scanner.next();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            calculator.calculate();
        }

        System.out.println("Хотите продолжить игру?");
        String answer = scanner.next();

        if (answer.equals("yes")) {
            stop = true;
        } else if(answer.equals("no")) {
            stop = false;
        } else {

        }
    }
}