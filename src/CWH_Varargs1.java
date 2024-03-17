
// VarArgs is actually used when we don't actually know how many arguments to pass.

public class CWH_Varargs1 {
    static int solve(int ...arr)
    {
        // ...arr -> similar to an -> [] arr
        int sum = 0;
        for(int it : arr)
            sum += it;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("the sum of no number is: " + solve());
        System.out.println("the sum of one number is: " + solve(2));
        System.out.println("the sum of five numbers is: " + solve(1,2,3,4,5));
        System.out.println("the sum of two numbers is: " + solve(1,2));
    }
}
