public abstract class Mammal extends Animal {
    protected int speed;
    public Mammal(String name ,int age , String info , int speed){
        super(name , age ,info);
        this.speed = speed;
    }
    @Override
    public void show() {
        System.out.println("name:" + name +"age:" + age +"speed:" + speed + "info:" + info);
    }
}
