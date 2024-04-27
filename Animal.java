public abstract class Animal {
    private String name;
    private int age;
    private String text;

    public Animal(String name, int age, String text) {
        this.name = name;
        this.age = age;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setText(String text) {
        this.text = text;
    }

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
