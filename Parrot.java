public class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, int speed, String ability) {
        super(name, age, speed, ability);
    }

    public String getName() {
        return super.getName();
    }
}
