package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);



        int result2 = list.stream().reduce(2, (accumulator, element) -> accumulator * element);
        System.out.println(result2);

        List<String> ls = new ArrayList<>();
        ls.add("Hi");
        ls.add("Bye");
        ls.add("Okay");
        ls.add("Learning java!");
        ls.add("namely Lambda");
        String res3 = ls.stream().reduce((a, e)->a+" " +e).get();
        System.out.println(res3);


        //  List<Integer> list100 = new ArrayList<>();
      /*  Optional<Integer> o = list.stream().reduce((accumulator, element) -> accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("NOT HAVE ANYTHING");
        }*/
    }


//        System.out.println(list100);
}

