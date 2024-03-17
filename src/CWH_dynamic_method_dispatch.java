/*
Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
A real-life example would be -
List<Integer> arr = new ArrayList<>();
Now, in this case, arr is an object of the class "ArrayList" and of the instance "list".

Notes -
Integer a;  -> an object "a" of class "Integer".
int a;   -> primitive data type "int".
*/

class Phone{
    public void showTime(){
        System.out.println("Show the time...");
    }
    public void greet(){
        System.out.println("Good morning! I am a Phone");
    }
}

class SmartPhone extends Phone{
    @Override
    public void greet(){
        System.out.println("Good morning! I am a smartPhone");
    }
    public void playMusic(){
        System.out.println("Play the music...");
    }
}

public class CWH_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone ph1 = new Phone();   // Allowed
        SmartPhone sph1 = new SmartPhone();  // Allowed

        Phone ph2 = new SmartPhone();  // Allowed   -> ph2 is an object which is an instance of "SmartPhone2" class and it references to "Phone" class. In short, ph2 is an object of class SmartPhone and type of class Phone.
        //  SmartPhone sph2 = new Phone();  // Not allowed

        ph2.greet();  // greet of smartPhone
        ph2.showTime();  // allowed
        //  ph2.playMusic(); // not allowed
    }
}
