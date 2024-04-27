public class Girafe extends Mammal implements Prey{
    public Girafe(String name, int age, int speed, String ability) {
        super(name, age, speed);
        super.ability = ability;
    }
}
