import java.util.Scanner;

public class CWH_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for(int i=0;i<5;i++)
        {
            double n = sc.nextDouble();
            sum += n;
        }
        sum /= 500;
        sum *= 100;
        System.out.println(sum);
    }
}
