import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}
class Animal {
    private String name;
    private int age;
    private int heightOrSpeed;
    private String property;
    public Animal (String name, int age, int heightOrSpeed, String property) {
        this.setName(name);
        this.setAge(age);
        this.setHeightOrSpeed(heightOrSpeed);
        this.setProperty(property);
    }
    public void show () {
        System.out.println(name + "," + age + "," + heightOrSpeed + "," + property);
    }

    public String name() { return name; }
    public int age() { return age; }
    public String property() { return property; }
    public int heightOrSpeed() { return heightOrSpeed; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setProperty(String property) { this.property = property; }
    public void setHeightOrSpeed(int heightOrSpeed) { this.heightOrSpeed = heightOrSpeed; }
}
interface Hunter {}
interface Prey {}
class Mammal extends Animal {
    public Mammal (String name, int age, int speed, String property) {
        super(name, age, speed, property);
    }
}
class Cheetah extends Mammal implements Hunter {
    public Cheetah (String name, int age, int speed, String property) {
        super(name, age, speed, property);
    }
}
class Giraffe extends Mammal implements Prey {
    public Giraffe (String name, int age, int speed, String property) {
        super(name, age, speed, property);
    }

}
class Bird extends Animal {
    public Bird (String name, int age, int height, String property) {
        super(name, age, height, property);
    }
}
class Eagle extends Bird implements Hunter {
    public Eagle (String name, int age, int height, String property) {
        super(name, age, height, property);
    }
}
class Parrot extends Bird implements Prey {
    public Parrot (String name, int age, int height, String property) {
        super(name, age, height, property);
    }
}
