public abstract class Mammal extends Animal{
    protected int speed;

    public Mammal(String name, int age, int Speed) {
        super(name, age);
        speed = Speed;
    }


    public void show() {
        System.out.println("name:" + name + ",age:" + age + ",speed:" + speed + ",\"" + ability + "\"");
    }
}
