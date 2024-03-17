import java.util.*;

public class CWH_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 100;
        marks[1] = 69;
        marks[2] = 88;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try{
                System.out.println("The marks corresponding to the index provided : " + marks[ind] );
                System.out.println("Provide the number - ");
                int number = sc.nextInt();
                try{
                    System.out.println("Marks/number = " + marks[ind]/number);
                    flag = false;
                }
                catch(ArithmeticException e){
                    System.out.println("Some arithmetic exception occurred!");
                    System.out.println(e);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds exception occurred!");
                System.out.println(e);
            }
        }
    }
}
