public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, int heightOfFly, String special){
        super(name, age, heightOfFly, special);
    }

    public void hunt(Prey a) {
        System.out.println(name + " hunted " + a.getName());
    }
}
