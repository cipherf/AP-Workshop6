public class Cheetah extends Mammmal implements Hunter {
    public Cheetah(String name, int age, int speed, String text) {
        super(name, age, speed, text);
    }
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getSpeed()
        + "," + super.getText());
    }
    public void hunt(Animal a){
        if(!(a instanceof Prey)) System.out.println("Cannot hunt");
        System.out.println(super.getName() + " hunted " + a.getName());
    }
}
