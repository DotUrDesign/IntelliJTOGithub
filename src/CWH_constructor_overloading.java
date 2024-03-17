// base class
class Base{
    public Base(){
        System.out.println("I am a base constructor!");
    }

    public Base(int x){
        System.out.println("Value of x from the base class = " + x);
    }
}

class Derived extends Base{
    public Derived(){
        System.out.println("I am a derived constructor!");
    }
    public Derived(int x, int y){
        super(x);
        System.out.println("Value of y from the derived class = " + y);
    }
}

class ChildOfDerived extends Derived{
    public ChildOfDerived() {
        System.out.println("I am a child constructor of a child class of derived class!");
    }
    public ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("Value of z from child of derived class = " + z);
    }
}

public class CWH_constructor_overloading {
    public static void main(String[] args) {
        // object of base class with no parameters
        Base b = new Base();

        // object of derived class with no parameters
        Derived d = new Derived();

        // object of the child of derived class with no parameters
        ChildOfDerived cd = new ChildOfDerived();

        // object of base class with parameters
        Base b1 = new Base(2);

        // object of derived class with parameters
        Derived d1 = new Derived(4,5);

        // object of the child of derived class with parameters
        ChildOfDerived cd1 = new ChildOfDerived(34, 45, 56);
    }
}
