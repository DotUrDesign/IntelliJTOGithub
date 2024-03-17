/*
    JAVA FINALLY BLOCK -
    Finally block contains the code which is actually executed whether the exception is handled or not.
    It is used to execute code containing instructions to release the system resources, close a connection, etc.
*/

import java.util.*;
public class CWH_Finally {
    public static int firstCase(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up the resources...This is the end of this function.");
        }
        return -1;
    }

    public static void secondCase(){
        int a = 10;
        int b = 5;
        while(true)
        {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("Value of b = " + b);
            }
            b--;
        }
    }

    public static void thirdCase(){
        try{
            System.out.println(200/10);
        }
        finally{
            System.out.println("Yes, its the last function to be executed..");
        }
    }
    public static void main(String[] args) {
        // 1st use case of "finally" in java...
        int k = firstCase();
        System.out.println(k);

        // 2nd use case of "finally" in java...
        secondCase();

        // try & finally block -> no catch block -> possible
        thirdCase();
    }
}
