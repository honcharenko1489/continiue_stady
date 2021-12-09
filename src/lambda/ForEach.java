package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("hii ", "how are you?", "normal");
        for (String s: list) {
            System.out.println(s);
        }
    list.forEach(str-> System.out.println(str));
            List<Integer> list12 = new ArrayList<>();
            list12.add(1);
            list12.add(2);
            list12.add(3);
            list12.add(4);
            list12.add(5);
        list12.forEach(el-> {System.out.println(el);
        el*=2;
        System.out.println(el);});
    }
}
