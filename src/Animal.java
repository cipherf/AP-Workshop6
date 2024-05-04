public abstract class Animal {
    private String name;
    private String age;
    private String specialThing;

    public Animal(String name, String age, String specialThing) {
        this.name = name;
        this.age = age;
        this.specialThing = specialThing;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSpecialThing() {
        return specialThing;
    }
    public abstract void show();
}
