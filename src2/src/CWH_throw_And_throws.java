/*
    The throw keyword - The throw keyword is used to throw an exception explicitly by the programmer.

    The throws keyword - Throws java throws keyword is used to declare an exception. This gives an information to the programmer that there might be an exception, so it's better to be prepared with a try catch block.
 */

import java.util.*;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Negative radius!";
    }
    @Override
    public String getMessage(){
        return "Provide a positive valued radius.";
    }
}
public class CWH_throw_And_throws {

    public static double area(int r) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int ans = divide(6, 0);
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("Can't divide by 0. Provide any other number.");
        }

        try{
            double ans = area(2);
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
