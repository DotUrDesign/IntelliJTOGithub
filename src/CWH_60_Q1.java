abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("writing some stuffs...");
    }
    public void refill(){
        System.out.println("Refilling the pen...");
    }
    public void changeNib(){
        System.out.println("Changing Nib...");
    }
}

public class CWH_60_Q1 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
