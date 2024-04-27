public abstract class Mammal extends Animal{
    private int runningSpeed;

    public Mammal(String name, int age, int runningSpeed) {
        super(name, age);
        this.runningSpeed = runningSpeed;
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println("1.name: " + getName() + ",age: " + getAge() + ",speed: " + getRunningSpeed());
    }
    public int getRunningSpeed() {
        return runningSpeed;
    }
    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunts for food.");
    }

}
