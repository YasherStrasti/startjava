public class WolfTest {
    public static void main(String args[]) {
        Wolf wolf = new Wolf();
        
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Окрас: " + wolf.getColor());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        
        wolf.setName("Snow");
        wolf.setSex("Female");
        wolf.setColor("Black");
        wolf.setWeight(25);
        wolf.setAge(6);

        System.out.println("\nКличка волка: " + wolf.getName());
        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Окрас: " + wolf.getColor());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        
        System.out.println("\nПоведение волка:");
        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.move();
    }
}