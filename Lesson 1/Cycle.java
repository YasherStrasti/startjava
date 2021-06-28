public class Cycle {
    public static void main(String[] args) {
        int numWhile = 6;
        int numDoWhile = 10;
        int sum = 0;
        System.out.println("Цикл for:");

        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Цикл while:");

        while(numWhile >= -6) {
            System.out.print(numWhile + " ");
            numWhile = numWhile - 2;
        }

        System.out.println();
        System.out.println("Цикл do-while: ");

        do {
            if(numDoWhile % 2 != 0) {
                sum = sum + numDoWhile;
            }
            numDoWhile++;
        } while(numDoWhile <= 20);
        
        System.out.println(sum + " "); //Сумма нечетных чисел
    }
}