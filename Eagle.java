public class Eagle extends Bird implements Hunter{
    
    public Eagle(String name , int age , int height, String ability){
        super(name,age , height , ability);
    }

    public void hunt(Prey prey){
        System.out.println(getName() + " hunted " + prey.getName());
    }
}
