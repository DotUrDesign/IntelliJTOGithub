
// Method overloading can only be possible in case of different number or type of arguments.

public class CWH_method_overloading {
    static String greeting(){
        return "Hello Sir!";
    }

    static String greeting(String s){
        return ("Hello " + s + "!");
    }

    static String greeting(int n){
        return (n + " is a good number!");
    }

    /*
    static int greeting(String s){
        return 23;
    }
     */

    public static void main(String[] args) {
        // in case of different number of arguments
        // case 1 - no arguments
        String greet1 = greeting();
        System.out.println(greet1);

        // case 2 - one argument
        String person1 = "Pratyush";
        String greet2 = greeting(person1);
        System.out.println(greet2);

        // case 3 - same method name & different type of arguments.
        String s = greeting(42);
        System.out.println(s);

        /*
        // in case of different return type... it gives error i.e., it does not support method overloading.
        String person2 = "Rakesh";
        int greet3 = greeting(person2);
        System.out.println(greet3);
         */
    }
}
