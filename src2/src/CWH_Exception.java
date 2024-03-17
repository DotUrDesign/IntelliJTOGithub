/*
    Exception class in JAVA -
    The exception class has the following methods:
    1) String toString() executed when sout(e) is ran
    2) void printStackTrace() - prints Stack trace
    3) String getMessage() - prints the exception message
 */

import java.util.*;

class MyException extends Exception{
    @Override
    public String toString(){
        return "Can't divide by 0";
    }
    @Override
    public String getMessage(){
        return "It will result in undefined value.";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be less than 18.";
    }
    @Override
    public String getMessage(){
        return "Restricted for the under-aged people.";
    }
}

public class CWH_Exception {
    public static void main(String[] args) {
        int denominator;
        Scanner sc = new Scanner(System.in);
        denominator = sc.nextInt();
        if(denominator == 0){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
        else {
            System.out.println("And u are good to go!");
        }

        int age = sc.nextInt();
        if(age < 18){
            try{
                throw new MaxAgeException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Nope, just get lost.");
            }
        }
        else {
            System.out.println("And all set!");
        }

        int singleDigit = sc.nextInt();
        if(singleDigit < 0 || singleDigit > 9){
            try{
                throw new ArithmeticException("Its not a single-digit number!");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
