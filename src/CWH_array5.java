import java.util.*;

public class CWH_array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        System.out.println(arr);
        int i=0, j =n-1;
        while(i < j)
        {
            Collections.swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
