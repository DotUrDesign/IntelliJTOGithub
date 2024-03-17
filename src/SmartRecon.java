import java.util.Scanner;

public class SmartRecon {

    // nth fibonaaci number
    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            n--;
            if(n < 0)
                System.out.println("Invalid input");
            int ans = fibonacci(n);
            System.out.println(ans);
            t--;
        }
    }
}
