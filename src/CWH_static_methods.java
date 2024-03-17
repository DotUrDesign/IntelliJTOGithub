class test2{
     public static int method3(){
        System.out.println("Method-3");
        return 56;
    }
}

public class CWH_static_methods {
    static int method1(){
        System.out.println("Method-1");
        return 42;
    }
    void method2(){
        System.out.println("Method-2");
    }

    public static void main(String[] args) {
        // inside the same class...
        int value = method1();
        System.out.println(value);

        // method2() --> throws error, a non-static method cannot be accessed from a static context. Static context -> main function, non-static method -> method2()

        // outside the current class...
        value = test2.method3();
        System.out.println(value);

        // can access the static methods via objects.
        test2 t = new test2();
        value = test2.method3();
        System.out.println(value);
    }
}
