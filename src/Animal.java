import java.util.ArrayList;
public abstract class Animal {
    private String name;
    private int age;
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + ", age: " + age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }

    public abstract void hunt(Prey prey);

}
