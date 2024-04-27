
class Main {

    public static void main(String[] args) {

    }
}
abstract class Animal{
    protected String name;
    protected int age;
    protected String characteristics;
    abstract  void show(Animal animal);

    public Animal(String name, int age, String characteristics) {
        this.name = name;
        this.age = age;
        this.characteristics = characteristics;
    }
}
interface Prey{

}
interface Hunter{

}
abstract class Bird extends Animal{
     void show(Bird bird){
         System.out.println("Name : "+ bird.name + "Age : " + bird.age + "Height : " + bird.height + "Character : "+ bird.characteristics);
    }
    public Bird(String name, int age, String characteristics, double height) {
        super(name, age, characteristics);
        this.height = height;
    }

    private double height;
}
abstract class Mammals extends Animal{
     void show(Mammals mammals){
         System.out.println("Name : "+ mammals.name + "Age : " + mammals.age + "Speed: " + mammals.speed + "Character : "+ mammals.characteristics);
    }

    public Mammals(String name, int age, String characteristics, int speed) {
        super(name, age, characteristics);
        this.speed = speed;
    }

    private int speed;
}
abstract class Eagle extends Bird implements Hunter{


    public Eagle(String name, int age, String characteristics, double height) {
        super(name, age, characteristics, height);
    }
}
abstract class Cheetah extends Mammals implements Hunter{
    public Cheetah(String name, int age, String characteristics, int speed) {
        super(name, age, characteristics, speed);
    }
}
abstract class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, String characteristics, double height) {
        super(name, age, characteristics, height);
    }
}
abstract class Girafe extends Mammals implements Prey{
    public Girafe(String name, int age, String characteristics, int speed) {
        super(name, age, characteristics, speed);
    }
}
