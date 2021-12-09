import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(8);
        ts.add(2);
        ts.add(1);
        ts.add(10);
        ts.remove(2);
        System.out.println(ts.contains(2));
    }
}
