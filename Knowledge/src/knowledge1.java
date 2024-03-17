import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class knowledge1 {
    public static void main(String[] args) {

        // list of integers...
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
//        System.out.println(arr[1]);
        System.out.println(arr.get(1));


        // declaration of HashMaps...
        HashMap<Integer, Integer> mpp1 = new HashMap<>();

        // pushing key-value pairs
        for(Integer it : arr)
            mpp1.put(it, mpp1.getOrDefault(it, 0) + 1);

        // iterating over the HashMap...
        // style-1...using entrySet()
        for(Map.Entry<Integer, Integer> entry : mpp1.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " " + value);
        }

        System.out.println();
        System.out.println("another method of iterating in the HashMap!!");

        // style-2...without using any entrySet() -> directly from the keySet();
        for(Integer it : mpp1.keySet())
        {
            int key = it;
            int value = mpp1.get(it);
            System.out.println(key + " " + value);
        }
        System.out.println();
    }
}
