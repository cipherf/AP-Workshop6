public class Cheetah extends Mammmal implements Hunter {
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getSpeed()
        + "," + super.getText());
    }
}
