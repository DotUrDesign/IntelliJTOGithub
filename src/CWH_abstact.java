abstract class Phone2{
    abstract public void turnOn();
    abstract public void greet();

    public void run(){
        System.out.println("Running...");
    }
}

// concrete derived class from the super class "Phone2".
class SmartPhone2 extends Phone2{
    public void turnOn(){
        System.out.println("Turning on...");
    }
    public void greet(){
        System.out.println("Good morning!");
    }

    public void switchOf(){
        System.out.println("Switching off...");
    }
}

// abstract derived class from the super class "Phone2".
abstract class SmartPhone3 extends Phone2{
    public void camera(){
        System.out.println("Turn on the camera.");
    }
}

public class CWH_abstact {
    public static void main(String[] args) {
        SmartPhone2 sm = new SmartPhone2();
        sm.turnOn();
        sm.greet();

//        SmartPhone3 sm2 = new SmartPhone3();   -> gives error, as it is not possible to build an object of an abstract class.

//        Phone2 ph = new Phone2();  -> gives error, as it is not possible to build an object of an abstract class.

        Phone2 vivo = new SmartPhone2();   // allowed -> we are creating an object of the SmartPhone class which is referencing to Phone2 class. Basically, it's allowed to make an object of a concrete class and referencing to an abstract class.
        vivo.turnOn();
        vivo.greet();
        vivo.run();
//        vivo.switchOff();  --> gives error, cannot access the alone methods of the smartPhone2 as the object is not referencing to that class.

//        Phone2 oppo = new SmartPhone3();  -> not allowed, as Smartphone3 and Phone2 both are abstract classes.
    }
}
