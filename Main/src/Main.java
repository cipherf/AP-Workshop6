import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> arrayList = new ArrayList<>();
        arrayList.add(new Girafe("girafe", 14, 13, "tallest"));
        arrayList.add(new Parrot("parrot", 7, 15, "talking"));
        arrayList.add(new Eagle("eagle", 37,100, "dangerous"));
        arrayList.add(new Cheetah("cheetah", 17, 90, "fastest"));
        for(int i = 0; i < arrayList.size(); i++)
            arrayList.get(i).show(i + 1);
        ((Hunter)arrayList.get(2)).hunt((Prey)arrayList.get(1));
        ((Hunter)arrayList.get(3)).hunt((Prey)arrayList.get(0));
    }
}