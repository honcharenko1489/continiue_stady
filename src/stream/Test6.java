package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {

    Stream<Integer> str1 = Stream.of(1,2,3,4,5,1,2,3);
        /*str1.filter(el->
                {
                    System.out.println("!!! ");
                 return el%2==0;
                }).collect(Collectors.toList());
        Stream<Integer> str2 = Stream.of(1,2,3,4,5);
        Stream<Integer> str3 = Stream.of(6,7,8,9,4);
        Stream<Integer> str4 = Stream.concat(str2, str3);
        str4.forEach(System.out::print);*/
        Stream<Integer> str5 = Stream.of(1,2,3,4,5,1,2,3);
        //str5.distinct().forEach(System.out::println);
       // System.out.println(str5.count());
       // System.out.println(str5.distinct().count());
        System.out.println(str5.distinct().peek(System.out::println).count());

    }
}
