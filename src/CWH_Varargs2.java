public class CWH_Varargs2 {
    static int solve(int x, int ...arr)
    {
        int sum = x;
        for(int it : arr)
            sum += it;
        return sum;
    }

    public static void main(String[] args) {
        // the solve function is valid only if the user wants to get the sum of one or more numbers.
//        System.out.println("the sum of one number is: " + solve());   -> gives error, minimum 2 parameters required.
        System.out.println("the sum of 2 numbers is: " + solve(3));
        System.out.println("the sum of 2 numbers is: " + solve(3, 4));
        System.out.println("the sum of 3 numbers is: " + solve(3,4, 5));
    }
}
