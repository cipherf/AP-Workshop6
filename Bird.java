public abstract class Bird extends Animal {
    protected int height;

    public Bird(String name, int age, int Height) {
        super(name, age);
        height = Height;
    }


    public void show() {
        System.out.println("name:" + name + ",age:" + age + ",height:" + height + ",\"" + ability + "\"");
    }
}
