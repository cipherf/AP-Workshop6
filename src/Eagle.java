public class Eagle extends Birds implements Hunter{
    private String special;
    public Eagle(String name, int age, int flightHeight, String special) {
        super(name, age, flightHeight);
        this.special = special;
        Animal.getAnimals().add(this);
    }
    @Override
    public void show() {
        //Row. name, age, height of fly/speed, animal special :
        System.out.println("3.name: " + getName() + ",age: " + getAge() + ",height of fly: " + getFlightHeight() + ", " + special);
    }

}
