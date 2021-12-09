package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> doubList = new ArrayList<>();
        doubList.add(10.0);
        doubList.add(5.0);
        doubList.add(1.0);
        doubList.add(2.0);

        /*Double someResult = doubList.parallelStream().reduce((accumulator, element)->accumulator+element).get();
        System.out.println(someResult);*/


        Double divisionResult = doubList.parallelStream().reduce((accumulator, element)->accumulator/element).get();
        System.out.println(divisionResult);
    }
}
