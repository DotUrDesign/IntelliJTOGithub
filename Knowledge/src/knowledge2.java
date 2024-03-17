import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class knowledge2 {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(96);
        arr1.add(2);
        arr1.add(25);
        arr1.add(4);
        arr1.add(45);
        System.out.println(arr1);

        // sort a list of integers...
        Collections.sort(arr1);
        System.out.println(arr1);

        int[] arr3= {5, 2, 9, 1, 5, 6};
        // sort an array of integers...
        Arrays.sort(arr3);

        /*
        Collections.sort is used in case of lists and Arrays.sort is used in case of arrays.
        Time complexity for both the functions are O(n logn)
        Typically, the collections.sort func uses the dual-pivot quick sort algorithm for primitive types like characters.
        And the arrays.sort function uses the TimSort algo, which is hybrid sorting algo derived from merge sort and
        insertion sort.
         */

        // check if arr1 is equal to arr2...
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(25);
        arr2.add(45);
        arr2.add(96);

        if(arr1.equals(arr2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
