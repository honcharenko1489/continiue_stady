package nested_classes.anonymus_class;


public class AnonymousClass {
    private int x=10;
    public static void main(String[] args) {

        Math3 m = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a+b+ac.x;
            }


        };
        System.out.println(m.doOperation(3, 8));
        Math3 m1 = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m1.doOperation(2, 8));
    }
}
interface Math3 {
    int doOperation(int a, int b);
}
