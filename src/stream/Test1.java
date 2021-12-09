package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Hi");
        al.add("Bye");
        al.add("Ok");
        al.add("Learning java");
        al.add("namely Lambda");
       /* for (int i = 0; i<al.size(); i++){
            al.set(i, String.valueOf(al.get(i).length()));
        }*/
        List<Integer> al2 = al.stream().map(el -> el.length()).collect(Collectors.toList());
        // System.out.println(al2);
        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        // System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hi");
        set.add("Bye");
        set.add("Okay");
        set.add("Learning java!");
        set.add("namely Lambda");
        System.out.println(set);
        Set<Integer> sett22 = set.stream().map(ss->ss.length()).collect(Collectors.toSet());
        List<Integer> se = set.stream().map(ss->ss.length()).collect(Collectors.toList());
        System.out.println(se);
    }

}
