public abstract class Bird extends Animal {
    private int flyH;

    public Bird(String name, int age, int flyh, String text) {
        super(name, age, text);
        this.flyH = flyh;
    }

    public void setFlyH(int flyH) {
        this.flyH = flyH;
    }

    public int getFlyH() {
        return flyH;
    }

    public abstract void show();
}
