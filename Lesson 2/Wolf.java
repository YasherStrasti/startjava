public class Wolf {
    private String sex = "male";
    private String name = "Skif";
    private String color = "grey";
    private int weight = 30;
    private int age = 9;

    public String getName() {  //getter'ы и setter'ы
        return name;
    }

    void setName() {
        if(name == "") {
            System.out.println("Пустая строка!");
        } else {
            this.name = name;
        }
    }

    public String getSex() {
        return sex;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    
    void setAge() {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void howl() {  //методы
        System.out.println("howl");
    }

    public void sit() {
        System.out.println("sit");
    }

    public void run() {
        System.out.println("running");
    }

    public void hunt() {
        System.out.println("hunting");
    }

    public void move () {
        System.out.println("moving");
    }
}