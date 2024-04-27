import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Eagle eagle1 = new Eagle("eagle1" , 15 , 50 , "Strong");
        Eagle eagle2 = new Eagle("eagle2" , 10 , 80 , "fly so high");
        Girafe girafe1 = new Girafe("girafe1" , 20 , 30 , "too tall");
        Girafe girafe2 = new Girafe("girafe2" , 25 , 25 , "just eat vegetables");
        Parrot parrot1 = new Parrot("parrot1" , 5 , 20 , "have good sound");
        Parrot parrot2 = new Parrot("parrot2" , 7 , 25 , "so beautiful");
        Cheetah cheetah1 = new Cheetah("cheetah1" , 10 , 150 , "the fastest");
        Cheetah cheetah2 = new Cheetah("cheetah2" , 15 , 120 , "cheeath coder");
        animals.add(eagle1);
        animals.add(eagle2);
        animals.add(girafe1);
        animals.add(girafe2);
        animals.add(parrot1);
        animals.add(parrot2);
        animals.add(cheetah1);
        animals.add(cheetah2);
        int num = 1;
        for(Animal i : animals){
            System.out.print(num + " : ");
            i.Show();
            num++;
        }
        System.out.println("success");
        eagle1.hunt(parrot1);
        

    }
}
