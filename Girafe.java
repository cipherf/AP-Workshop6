public class Girafe extends Mammmal implements Prey{
    public Girafe(String name, int age, int speed, String text) {
        super(name, age, speed, text);
    }
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getSpeed()
                + "," + super.getText());
    }
}
