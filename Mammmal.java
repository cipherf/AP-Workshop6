public abstract class Mammmal extends Animal {
    private int speed;

    public Mammmal(String name, int age, int speed, String text) {
        super(name, age, text);
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void show();

}
