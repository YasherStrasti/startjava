public class WolfTest {
    public static void main(String args[]) {
        Wolf wolf = new Wolf();
        
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Окрас: " + wolf.getColor());
        wolf.setAge(6);
        System.out.println("Новый возраст: " + wolf.getAge());

        System.out.println("\nПоведение волка:");
        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.move();
    }
}