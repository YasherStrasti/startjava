public class Cycle {
    public static void main(String[] args) {
        System.out.println("Цикл for:");

        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("Цикл while:");

        int numWhile = 6;

        while(numWhile >= -6) {
            System.out.print(numWhile + " ");
            numWhile -= 2;
        }

        System.out.println();
        System.out.println("Цикл do-while: ");

        int numDoWhile = 10;
        int sumOdd = 0;

        do {
            if(numDoWhile % 2 != 0) {
                sumOdd += numDoWhile;
            }
            numDoWhile++;
        } while(numDoWhile <= 20);
        
        System.out.println(sumOdd + " ");
    }
}