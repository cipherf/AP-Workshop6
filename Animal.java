public abstract class Animal {
    protected String name;
    protected int age;
    protected String info;
    public Animal(String name ,int age , String info){
        this.name = name;
        this.age = age;
        this.info = info;
    }
    public abstract void show();

}
