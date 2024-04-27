import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Parrot parrot = new Parrot("parrot1", 2, 100, "colorful");
        Eagle eagle = new Eagle("eagle1", 5, 500, "smart");
        Cheetah cheetah = new Cheetah("cheetah1", 10, 200, "wild and fast");
        Girafe girafe = new Girafe("girafe1", 7, 50, "tallest animal");
        animals.add(parrot); animals.add(cheetah); animals.add(eagle); animals.add(girafe);
        int i = 1;
        for (Animal animal : animals) {
            System.out.print(i + "--> ");
            animal.show();
            i++;
        }
    }
}
