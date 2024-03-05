package OOPs;

public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setTip(5);
        p1.setColor("Blue");

    }
}

class Pen{
     private  String color;

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

   private int tip;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

