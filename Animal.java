public abstract class Animal {
    protected String name;
    protected int age;
    protected String ability;

    public Animal(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public abstract void show();
}
