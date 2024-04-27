import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Animal> animals = new ArrayList<>();
        Cheetah cheetah1 = new Cheetah("simba" , 7 , "fast as rocket" , 100);
        Parrot bird1 = new Parrot("rio" , 2 , "talkative" ,30);
        Girafe girafe1 = new Girafe("lucas" , 4 , " tall but shy" , 10);
        Eagle eagle1 = new Eagle("max" , 10 , "lives in mountain" , 500 );
        animals.add(cheetah1);
        animals.add(bird1);
        animals.add(girafe1);
        animals.add(eagle1);
        for (Animal animal : animals){
            animal.show();
        }
        cheetah1.hunt(girafe1);
        eagle1.hunt(bird1);
    }
}
