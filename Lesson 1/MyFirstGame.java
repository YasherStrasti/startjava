public class MyFirstGame {
    public static void main(String[] args) {
        int magicNum = 38;

        for(int userNum = 0; userNum <= 100; userNum++) {
            if(userNum > magicNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(userNum < magicNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю, число угадано!");
            }
        }
    }
}