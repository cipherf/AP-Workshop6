import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        Girafe girafe = new Girafe("girafe", "12" , "it is really tall" , "35");
        Cheetah cheetah = new Cheetah("cheetah" , "10" , "super fast" , "65");
        Parrot parrot = new Parrot("parrot", "3", "very intelligent" , "1500");
        Eagle eagle = new Eagle("eagle" , "7" , "famous for its sight" , "10000");
        animals.add(girafe);
        animals.add(parrot);
        animals.add(cheetah);
        animals.add(eagle);
        int i=1;
        for (Animal animal : animals) {
            System.out.print(i++ + "    ");
            animal.show();
        }
    }
}