public class Mammal extends Animal{
    protected int speed;
    public Mammal(String name, int age, int speed, String special){
        super(name, age, special);
        this.speed = speed;
    }
    public void show(int row){
        System.out.printf("%d. name : %s, age : %s, speed : %d, %s", row, name, age, speed, special);
    }
}
