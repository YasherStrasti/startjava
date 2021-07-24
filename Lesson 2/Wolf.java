public class Wolf {
    private String name = "Skif";
    private String sex = "male";
    private String color = "grey";
    private int weight = 30;
    private int age = 5;

    //getter'ы и setter'ы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == "") {
            System.out.println("Пустая строка!");
        } else {
            this.name = name;
        }
    }

    public String getSex() {
        return sex;
    }

    public String setSex(String sex) {
        if(sex == "") {
            System.out.println("Пустая строка!");
        } else {
            this.sex = sex;
        }
        return null;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        if(color == "") {
            System.out.println("Пустая строка!");
        } else {
            this.color = color;
        }
        return null;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight <= 0) {
            System.out.println("Некорректный вес!");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст!");
        } else {
            this.age = age;
        }
    }

    //методы
    public void howl() {
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

    public void move() {
        System.out.println("moving");
    }
}