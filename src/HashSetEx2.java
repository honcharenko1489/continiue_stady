import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(8);
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(5);
        hs1.add(3);
        hs1.add(4);
        hs1.add(7);
        hs1.add(8);
        System.out.println("");
        HashSet<Integer> subtract = new HashSet<>(hs);
        subtract.removeAll(hs1);
        System.out.println(subtract);

    }
}
