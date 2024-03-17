import java.util.Scanner;
import java.util.Arrays;

public class CWH_array1 {
    public static void main(String[] args) {
        float [] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
            arr[i] = sc.nextFloat();
        float sum = 0;
        for(float it : arr)
                sum += it;
        System.out.println(sum);
    }
}
