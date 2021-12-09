package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 0, 8};
        /*Arrays.stream(arr).forEach(el-> {
            el *= 2;
            System.out.println(el);
        });*/
       /* Arrays.stream(arr).forEach(el->
                System.out.println(el));*/
        //Arrays.stream(arr).forEach(System.out::println);
//        Arrays.stream(arr).forEach(Utils::myMethod);
        Arrays.stream(arr).forEach(el->Utils.myMethod(  el));
    }
}

class Utils {
    public static void myMethod(int a) {
    a=a+5;
        System.out.println("Element "+a);
    }
}
