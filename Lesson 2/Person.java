public class Person {
    String name = "Ivan";
    String sex = "male";
    int age = 24;
    int height = 203;
    float weight = 90.3f;

    void move() {
        System.out.println("Moving");
    }

    String talk() {
        return "Hi!";
    }

    void run() {
        System.out.println("Running");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }

    String sit() {
        return "Sit!"
    }
}