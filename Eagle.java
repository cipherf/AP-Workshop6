public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, int speed, String ability) {
        super(name, age, speed, ability);
    }

    public void hunt(Prey prey) {
        System.out.println(super.getName() + " hunted " + prey.getName());
    }
}
