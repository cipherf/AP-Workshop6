import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Animal> animals = new ArrayList<Animal>();
        animals.add(new Giraffe("KID_Giraffe", 1, 10, "Kid Giraffe"));
        animals.add(new Parrot("Parrot", 2, 20, "Parrot can mimic human voice"));
        animals.add(new Eagle("Eagle", 3, 100, "Eagle is a predator"));
        animals.add(new Giraffe("MOM_Giraffe", 10, 60, "Supporter"));
        animals.add(new Cheetah("Cheetah", 5, 100, "fastest animal"));
        int counter = 1 ;
        for (Animal animal : animals) {
            System.out.print(counter+". ");
            animal.show();
            counter++ ;
        }
    }
}