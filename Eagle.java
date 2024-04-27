public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, int flyh, String text) {
        super(name, age, flyh, text);
    }
    public void show(){
        System.out.println(super.getName() + "," + super.getAge() + "," + super.getFlyH()
                + "," + super.getText());
    }
    public void hunt(Animal a){
        if(!(a instanceof Prey)) System.out.println("Cannot hunt");
        System.out.println(super.getName() + " hunted " + a.getName());
    }
}
