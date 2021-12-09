package stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 7, 18};
        /*arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));*/

        int result = Arrays.stream(arr).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);
    }
}
