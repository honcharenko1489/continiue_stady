package lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi");
        al.add("Bye");
        al.add("Ok");
        al.add("Learning java");
        al.add("namely Lambda");
        al.removeIf(r-> r.length()<5);
        System.out.println(al);
    }
}
