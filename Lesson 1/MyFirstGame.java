public class task1 {
    public static void main(String[] args) {
        int magicNum = 78;
        int userNum = 99;

        if(userNum > magicNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if(userNum < magicNum) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляю, число угадано!");
        }
    }
}