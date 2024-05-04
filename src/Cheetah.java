public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, String age, String specialThing, String speed) {
        super(name, age, specialThing, speed);
    }
    public void show(){
        System.out.println("name: " + getName() +" age: " + getAge()  +" speed: " + getSpeed() + " special thing about it: " + getSpecialThing());
    }
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}
