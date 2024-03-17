/*
    In Java, an interface cannot "implement" another interface, whereas on the flip side, a class can "implement" an interface.
    In Java, a class cannot "extend" an interface, whereas an interface can "extend" another interface.
 */

interface SampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class SampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Method-1 is running...");
    }
    public void meth2(){
        System.out.println("Method-2 is running...");
    }
    public void meth3(){
        System.out.println("Method-3 is running...");
    }
    public void meth4(){
        System.out.println("Method-4 is running...");
    }
}

public class CWH_interfaces4 {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
