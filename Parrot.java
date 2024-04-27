public class Parrot extends Bird implements Prey {
    public Parrot(String name, int age, int height, String ability) {
        super(name, age, height);
        super.ability = ability;
    }

    public String getName() {
        return name;
    }
}
