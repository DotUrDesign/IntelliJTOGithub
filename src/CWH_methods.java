public class CWH_methods {
    static String logic(int a, int b)
    {
        if(a > b)
            return "Alice";
        else
            return "bob";
    }

    String revLogic(int a, int b)
    {
        if(a > b)
            return "bob";
        else
            return "alice";
    }

    public static void main(String[] args) {
        /*
            Static methods are associated with the class, that means, we don't have to create any objects/instances to access those methods. This is also one of the reasons, why JAVA is not a purely object-oriented programming.
            Non-static methods or instance methods are associated with the objects of the class, that means, we have to create an object/instance to access these methods. This is one of the property of a purely object-oriented programming language.
         */
        int a = 10, b =5;
        String st1 = logic(10, 5);
        System.out.println(st1);
        a = 10;
        b = 16;
        String st2 = logic(a, b);
        System.out.println(st2);

        // without static keyword...
        CWH_methods obj = new CWH_methods();
        String s1 = obj.revLogic(a, b);
        System.out.println(s1);
    }
}
