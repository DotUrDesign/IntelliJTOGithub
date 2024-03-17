import java.util.Arrays;
import java.util.Scanner;

public class CWH_array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        for(int i=0;i<n;i++)
        {
                arr[i] = sc.nextDouble();
        }
        double sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        double avg = sum/n;
        System.out.println(avg);

        double s2 = 0;
        for(double it : arr)
            s2 += it;
        System.out.println(s2);
    }
}
