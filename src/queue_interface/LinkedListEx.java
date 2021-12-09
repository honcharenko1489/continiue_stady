package queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Zaur");
        q.offer("Chehol");
        q.offer("Perdak");
        q.offer("Lapa");
        q.offer("Cycka");
        System.out.println(q);
        /*System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println();*/
    }

}
