public class Girafe extends Mammal implements Prey{
    public Girafe(String name, String age, String specialThing, String speed) {
        super(name, age, specialThing, speed);
    }

    public void show(){
        System.out.println("name: " + getName() +" age: " + getAge()  +" speed: " + getSpeed() + " special thing about it: " + getSpecialThing());
    }
}
