public class Parrot extends Bird implements Prey{
    public Parrot(String name, String age, String specialThing, String heightOfFlight) {
        super(name, age, specialThing, heightOfFlight);
    }
    public void show(){
        System.out.println("name: " + getName() +" age: " + getAge()  +" height of flight: " + getHeightOfFlight() + " special thing about it: " + getSpecialThing());
    }
}
