public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, int age, int speed, String special){
        super(name, age, speed, special);
    }
    public void hunt(Prey a) {
        System.out.println(name + " hunted " + a.getName());
    }
}
