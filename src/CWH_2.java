import java.util.Scanner;

public class CWH_2 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the these numbers are: ");
        System.out.println(sum);

        // if the whitespaces found, it will stop searching for input. It will not take the whole line as input, only a word as input.
        System.out.println("Taking a string as input");
        String str = sc.next();
        System.out.println(str);

        // to take the whole line as input.
        System.out.println("Taking a line as input");
        sc.nextLine();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
