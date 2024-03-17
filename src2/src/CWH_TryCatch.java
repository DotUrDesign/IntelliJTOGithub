/*
     Errors - Syntax error
            - Logical error
            - Runtime error

     Exceptions - An exception is an event that occurs when a program is executed dissented the normal flow of instructions.
     Two types of execution
     - Checked exceptions -> compile-time exceptions (Handled by the compiler)
     - Unchecked exceptions -> Runtime exceptions

     Commonly occurring exceptions -
     1) Null pointer exception
     2) Arithmetic exception
     3) Array index out of bound exception
     4) Illegal argument exception
     5) Number format exception
 */
import java.util.*;

public class CWH_TryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 100;
        marks[1] = 88;
        marks[2] = 69;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[ind] );
            System.out.println("The value of array-value/number is : " + marks[ind]/number );
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds exception occurred!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
    }
}
