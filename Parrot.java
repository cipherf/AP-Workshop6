public class Parrot extends Bird implements Prey{
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getFlyH()
                + "," + super.getText());
    }
}
