package enums;

public class Test1 {
    public static final int  MONDAY=1;
        void method(int dayOfWeek){
            System.out.println("Today is "+ dayOfWeek);
        }
    public static void main(String[] args) {
            Test1 t1 = new Test1();
            t1.method(123);
    }
}
