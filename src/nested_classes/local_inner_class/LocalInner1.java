package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(16, 4);
    }
}

class Math {
    //private int  a = 10;
   // int divider = 5;
    public void getResult(int dividend , int divider) {
        class Division {


            public int getDivisionResult() {
                return dividend / divider;
            }

            public int getDivisionWithRemainder() {
                return dividend % divider;
            }
        }
        Division divi  = new Division();
       // divi.setDividend(a);
       // divi.setDivider(5);
        System.out.println("Dividend " + dividend);
        System.out.println("Divider " + divider/*divi.getDivider()*/);
        System.out.println("Division result " + divi.getDivisionResult());
        System.out.println("Division result with remainder " + divi.getDivisionWithRemainder());
    }
}
