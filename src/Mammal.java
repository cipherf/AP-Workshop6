public abstract class Mammal extends Animal{
    private String speed;

    public Mammal(String name, String age, String specialThing, String speed) {
        super(name, age, specialThing);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }
}
