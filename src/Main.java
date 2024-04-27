
class Main {

    public static void main(String[] args) {

    }
}
abstract class Animal{

}
interface Prey{

}
interface Hunter{

}
abstract class Bird extends Animal{

}
abstract class Mammals extends Animal{

}
abstract class Eagle extends Bird implements Hunter{

}
abstract class Cheetah extends Mammals implements Hunter{

}
abstract class Parrot extends Bird implements Prey{

}
abstract class Girafe extends Mammals implements Prey{

}
