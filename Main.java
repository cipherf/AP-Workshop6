import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> arr = new ArrayList<>();
        Parrot p = new Parrot("papar", 142, 100, "salam");
        Cheetah ct = new Cheetah("ct", 152, 122, "khodahafez");
        arr.add(new Parrot("p", 12, 10, "good"));
        arr.add(new Eagle("eg", 25, 24, "bad"));
        arr.add(new Cheetah("cht", 15, 12, "not bad"));
        arr.add(new Girafe("Gir", 18, 9, "not good"));
        int indx = 1;
        for(Animal a : arr){
            System.out.printf("%d.", indx ++);
            if(a instanceof Cheetah) {
                ((Cheetah)a).show();
                ((Cheetah)a).hunt(p);
                ((Cheetah)a).hunt(ct);
            }
            else if(a instanceof Girafe)
                ((Girafe)a).show();
            else if(a instanceof Parrot)
                ((Parrot)a).show();
            else if(a instanceof Eagle)
                ((Eagle)a).show();
        }

    }
}
