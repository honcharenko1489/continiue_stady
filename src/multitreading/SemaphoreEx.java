package multitreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Petro", callBox);
        new Person("Alex", callBox);
        new Person("Loh", callBox);
        new Person("Oleg", callBox);
        new Person("Lila", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name +" is veit");
            callBox.acquire();
            System.out.println(name +" used telephone");
            Thread.sleep(2000);
            System.out.println("some person is ended call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}