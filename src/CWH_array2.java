import java.util.Scanner;

public class CWH_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Yes, present");
        else
            System.out.println("No, not present");
    }
}
