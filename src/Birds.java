public abstract class Birds extends Animal{
    private int flightHeight;

    public Birds(String name, int age, int flightHeight) {
        super(name, age);
        this.flightHeight = flightHeight;
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println("2.name: " + getName() + ",age: " + getAge() + ",height of fly: " + getFlightHeight());
    }
    public int getFlightHeight() {
        return flightHeight;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}
