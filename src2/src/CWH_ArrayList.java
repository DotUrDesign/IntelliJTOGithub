/*
    -> Declaration
        ArrayList<Integer> arr = new ArrayList<>();

    -> Adding an element
        add() - used to insert an element in the arraylist.
        add(object) - inserts an element at the end of the arraylist.
        add(index, object) - inserts an element at the given index.

     -> Removing an element
        remove(index)

     -> checking if the arraylist contains a specific element or not
        contains(value) - returns a boolean value.

     -> merging two arraylists
        The elements of an arraylist can be merged into another arraylist with the help of the addAll() method.

     -> Finding the occurrence of a specific number in the arraylist
        Indexof(value) - returns index of first occ || if not present -> -1
        lastIndexOf(value) - returns index of last occ || if not present -> -1
 */

import java.util.*;
import java.util.ArrayList;
public class CWH_ArrayList {
    public static void main(String[] args) {
        // declaration
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(67);
        nums.add(300);

//        nums.add(3,5);  --> inserts 5 at index 3.
//        nums.add(5, 90);  --> throws error, as there is no element in index-4.


        // remove
        nums.remove(2);

        System.out.println(nums.contains(5));
        System.out.println(nums.contains(300));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(45);
        arr.add(103);
        arr.add(10);

        System.out.println(nums);

//        nums.addAll(arr);  -> by default, from the end of the list. -> same as nums.addAll(0, arr)
        nums.addAll(1, arr);  // -> starts merging from the index 1.

        System.out.println();
        System.out.println("After merging the array arr : ");
        System.out.println(nums);

        System.out.println();

        System.out.println("The first occurrence of 3 in nums is at index: " + nums.indexOf(103));

        System.out.println();

        System.out.println("The last occurrence of 10 in nums is at index: " + nums.lastIndexOf(10));

        System.out.println();

        // iterating over the arraylist -
        for(int i=0;i<nums.size();i++)
        {
            System.out.print(nums.get(i));
            if(i == nums.size()-1)
                continue;
            System.out.print(" - ");
        }
    }
}
