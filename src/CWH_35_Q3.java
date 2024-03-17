import java.util.Scanner;

public class CWH_35_Q3 {
    static int solve(int n)
    {
        if(n == 0 || n == 1)
            return n;
        return solve(n-1) + solve(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int value = solve(n);
        System.out.println(value);
    }
}