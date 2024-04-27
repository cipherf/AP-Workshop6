public class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, int heightOfFly, String special){
        super(name, age, heightOfFly, special);
    }

    public String getName() {
        return name;
    }
}
