package multitreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 t10 = new Thread10();
        Thread20 t20 = new Thread20();
        t10.start();
        t20.start();

    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("our DeadLock10: trie to catch monitor lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("monitor lock1 was  catched");
            System.out.println("our DeadLock10: trie to catch monitor lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("monitor lock1 and lock2 was  catched");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("our DeadLock20: trie to catch monitor lock2");
        synchronized (DeadLockEx.lock1) {
            System.out.println("monitor lock2 was  catched");
            System.out.println("our DeadLock20: trie to catch monitor lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("monitor lock1 and lock2 was  catched");
            }
        }
    }
}