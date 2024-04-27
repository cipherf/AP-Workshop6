public class Cheetah extends Mammal implements Hunter{
    private String special;
    public Cheetah(String name, int age, int runningSpeed, String special) {
        super(name, age, runningSpeed);
        this.special = special;
        Animal.getAnimals().add(this);
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println(" name: " + getName() + ",age: " + getAge() + ",speed: " + getRunningSpeed() + ", special: " + special);
    }
}
