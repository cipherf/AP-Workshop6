
public class Main {
    public static void main(String[] args) {

    }
}
class Animal {}
interface Hunter {}
interface Prey {}
class Mammal extends Animal {}
class Cheetah extends Mammal implements Hunter {}
class Giraffe extends Mammal implements Prey {}
class Bird extends Animal {}
class Eagle extends Bird implements Hunter {}
class Parrot extends Bird implements Prey {}
