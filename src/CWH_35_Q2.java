import java.util.Scanner;

public class CWH_35_Q2 {
    public static int solve(int n)
    {
        if(n == 0)
            return 0;
        return n + solve(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = solve(n);
        System.out.println(sum);
    }
}
