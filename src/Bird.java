public abstract class Bird extends Animal{
    private String heightOfFlight;

    public String getHeightOfFlight() {
        return heightOfFlight;
    }

    public Bird(String name, String age, String specialThing, String heightOfFlight) {
        super(name, age, specialThing);
        this.heightOfFlight = heightOfFlight;
    }
}
