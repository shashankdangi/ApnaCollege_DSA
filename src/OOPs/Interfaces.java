package OOPs;

public class Interfaces {
    public static void main(String[] args) {

    }
}

interface Herbivorce{

}

interface Carnivore{

}

class Bear implements Herbivorce , Carnivore {

}
interface ChessPlayer {
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up , down , left, right");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up down left right");
    }
}
