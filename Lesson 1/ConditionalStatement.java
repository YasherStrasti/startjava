public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.93;
        char firstWordFirstname = 'Z';
        boolean male = true;

        if(age > 20) {
            System.out.println("Возраст:" + age);
        }

        if(male) {
            System.out.println("Пол: мужской");
        }

        if(!male) {
            System.out.println("Пол: женский");
        }

        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        if(firstWordFirstname == 'M') {
            System.out.println("Первая буква имени: " + firstWordFirstname);
        } else if(firstWordFirstname == 'I') {
            System.out.println("Первая буква имени: " + firstWordFirstname);
        } else {
            System.out.println("Первая буква имени: " + firstWordFirstname);
        }
    }
}