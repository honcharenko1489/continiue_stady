package regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "hi my      friend, how is       going   java studying?";
        System.out.println(s1);
        s1 = s1.replace("java", "spring");
        System.out.println(s1);
        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);
        /*s1 = s1.replaceAll("\\bh\\w+", "X ");
        System.out.println(s1);*/
        s1 = s1.replaceFirst("\\bh\\w+", "X ");
        System.out.println(s1);
    }
}

