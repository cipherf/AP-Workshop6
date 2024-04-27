public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("eagle1", 2, 50, "don't have teeth");
        Parrot parrot = new Parrot("parrot1", 5, 10, "sings well");
        Cheetah cheetah = new Cheetah("cheetah1", 4, 40, "runs fast");
        Girafe girafe = new Girafe("girafe1", 6, 10, "have a tall neck");
        eagle.show();
        parrot.show();
        cheetah.show();
        girafe.show();
    }
}