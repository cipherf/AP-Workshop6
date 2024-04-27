public class Eagle extends Bird implements Hunter{
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getFlyH()
                + "," + super.getText());
    }
}
