package multitreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger1 {
    //static int counter;
    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
        //counter++;
         // counter.incrementAndGet();
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new myRunnableImplementation118());
        Thread thread2 = new Thread(new myRunnableImplementation118());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}

class myRunnableImplementation118 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicInteger1.increment();
        }
    }


}