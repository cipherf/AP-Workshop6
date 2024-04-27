public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, String info, int height) {
        super(name, age, info, height);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }
}
