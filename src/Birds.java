public abstract class Birds extends Animal{
    private int flightHeight;

    public Birds(String name, int age, int flightHeight) {
        super(name, age);
        this.flightHeight = flightHeight;
    }
    public abstract void show() ;
    public int getFlightHeight() {
        return flightHeight;
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void hunt(Prey prey) {
        if (prey instanceof Mammal) {
            System.out.println(getName() + " hunted " + prey.getName());
        } else {
            System.out.println(getName() + " can't hunt " + prey.getName());
        }
    }
}
