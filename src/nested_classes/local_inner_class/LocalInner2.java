package nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Addition implements  Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Addition add = new Addition();

        System.out.println(add.doOperation(5, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}