public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, int age, String info, int speed) {
        super(name, age, info, speed);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}
