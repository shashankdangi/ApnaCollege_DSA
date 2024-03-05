package OOPs;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}


abstract class Animals{
    String color;

    Animals(){
        color = "brown";
    }
    void eat(){
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends  Animals{
    void changeColor(){
        color="Dark brown";
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animals{

    void changeColor(){
        color="black";
    }
    void walk(){
        System.out.println("walks on two leg");
    }
}