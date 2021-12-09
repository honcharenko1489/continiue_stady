package lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("Hiiya"));
    }

    public static void main(String[] args) {
        def((s)->s.length());
    }
}
interface I{
    int abc(String s);
}