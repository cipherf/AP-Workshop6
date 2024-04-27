public class Animal {
    private String name;
    private int age;
    private String ability;
    private int speed;

    public Animal(String name, int age, int speed, String ability) {
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.speed = speed;
    }

    public void show(){
        System.out.println("name: " + name + ", age: " + age + ", height of fly/speed: " + speed + ", \"" + ability + "\"");
    }
}
