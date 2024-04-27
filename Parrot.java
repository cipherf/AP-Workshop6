public class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, int flyh, String text) {
        super(name, age, flyh, text);
    }

    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getFlyH()
                + "," + super.getText());
    }
}
