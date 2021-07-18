public class WolfTest {
    public static void main(String args[]) {
        Wolf wolf = new Wolf();
        
        System.out.println("Имя волка: " + wolf.name);
        System.out.println("Пол: " + wolf.sex);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Окрас: " + wolf.color);

        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.move();
    }
}