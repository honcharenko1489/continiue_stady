package alishev;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[][]  ff={{2,1},{1,1,5},{5,3,2}};
        for (int i=0; i<ff.length; i++){
            System.out.println();
            for (int b=0; b< ff[i].length; b++){
                System.out.print(ff[i][b]+"  ");
            }
        }
//        System.out.println(ff[1][2]);
    /* String[] ss = new String[4];
     ss[0] = "My";
     ss[1] = "Best";
     ss[2] = "Little";
     ss[3] = "Program";

        for (String str: ss) {
            System.out.println(str);
        }
        int[] f = {7,5,2,1};
        int sum = 0;
        for (int g:f) {
            sum=sum+g;
        }
            System.out.println(sum);*/

        /* String[] words = {"many", "two", "one", "place"};
      for (int i=0; i<words.length; i++){
          System.out.print(words[i]+" ");
      }
        System.out.println(Arrays.toString(words));*/

        /*  int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;
//            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
        */
//        System.out.println(a[2]);
        /*for (int  i=0; i<a.length; i++){
             System.out.println(i);
         }*/
    }
}
