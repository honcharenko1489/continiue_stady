import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lis = new LinkedHashSet<>();
        lis.add(5);
        lis.add(3);
        lis.add(1);
        lis.add(8);
        lis.add(10);
        System.out.println(lis);
        lis.remove(8);
        System.out.println(lis);
        System.out.println(lis.contains(8));
    }
}
