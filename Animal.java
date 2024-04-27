public class Animal{
    private String name;
    private int age;
    private String ability;
    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getAbility() {
        return this.ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name , int age ,int height ,String ability){
        this.name = name;
        this.age = age;
        this.ability = ability;
        this.height = height;
    }
    public void Show(){
        System.out.println("name : " + name + " , age : " + age + " , height of fly/speed : " + height + " , " + ability);
    }
}