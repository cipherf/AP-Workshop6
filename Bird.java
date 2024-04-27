public  abstract class Bird extends Animal {
    protected int height;
    public Bird(String name ,int age , String info , int height){
        super(name , age , info);
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println("name: " + name +" age: " + age +" height: " + height + " info: " + info);
    }
}
