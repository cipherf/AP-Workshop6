public class Bird extends Animal{
    protected int heightOfFly;
    public Bird(String name, int age, int heightOfFly, String special){
        super(name, age, special);
        this.heightOfFly = heightOfFly;
    }
    public void show(int row){
        System.out.printf("%d. name : %s, age : %s, height of fly : %d, %s\n", row, name, age, heightOfFly, special);
    }
}
