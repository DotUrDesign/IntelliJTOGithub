import java.util.Scanner;

public class CWH_array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] arr1 = new double[2][3];
        double [][] arr2 = new double[2][3];

        double [][] ans = new double[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                arr1[i][j] = sc.nextDouble();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                arr2[i][j] = sc.nextDouble();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                ans[i][j] = arr1[i][j] + arr2[i][j];
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
