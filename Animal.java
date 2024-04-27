public abstract class Animal {
    private String name;
    private int age;
    private String text;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getText() {
        return text;
    }

    public abstract void show();

}
