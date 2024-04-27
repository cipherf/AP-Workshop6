public class Girafe extends Mammmal implements Prey{
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getSpeed()
                + "," + super.getText());
    }
}
