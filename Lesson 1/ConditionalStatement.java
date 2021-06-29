public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("Возраст:" + age);
        }

        boolean male = true;
        if(male) {
            System.out.println("Пол: мужской");
        }

        if(!male) {
            System.out.println("Пол: женский");
        }

        double height = 1.93;
        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char firstLetter = 'Z';
        if(firstLetter == 'M') {
            System.out.println("Первая буква имени: " + firstLetter);
        } else if(firstLetter == 'I') {
            System.out.println("Первая буква имени: " + firstLetter);
        } else {
            System.out.println("Первая буква имени: " + firstLetter);
        }
    }
}