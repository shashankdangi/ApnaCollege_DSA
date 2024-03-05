package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        tuna.swim();
    }
}
//Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats..");
    }

    void breathe(){
        System.out.println("Breathes..");
    }
}


// Child Class

class Fish extends Animal{
    int fins ;

    void swim(){
        System.out.println("Swim in water...");
    }
}