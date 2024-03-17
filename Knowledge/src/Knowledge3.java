import java.util.Set;
import java.util.TreeSet;

public class Knowledge3 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(5);
        s.add(2);
        s.add(45);
        s.add(1);

        for(Integer it : s)
            System.out.println(it);
    }
}
