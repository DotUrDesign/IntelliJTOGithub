interface Bicycle{
    String cycleName = "Atlas";
    void speedUp();
    void slowDown();
}

class Cycle1 implements Bicycle{

    int speed = 10;
    // the methods of the interface when overridden, should always be declared "public".
    public void speedUp(){
        speed = speed + 30;
        System.out.println("The speed of the cycle : " + speed );
    }
    public void slowDown(){
        speed = speed - 10;
        System.out.println("The speed of the cycle : " + speed );
    }
    void print(){
        System.out.println("This is a cycle!");
    }
}

public class CWH_interfaces {
    public static void main(String[] args) {
        Cycle1 atlas = new Cycle1();
        atlas.speedUp();
        atlas.slowDown();
        atlas.print();
        System.out.println(atlas.cycleName);

//        atlas.cycleName = "Hero";   -> throws error, as the variables declared in the interface are final, they cannot be reassigned with aa new one.
    }
}
