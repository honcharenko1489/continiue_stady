package multitreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Boris", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);

    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
            /*System.out.println(name + " Wait");
            lock.lock();*/
                System.out.println(name + "  joining bankomat");

                Thread.sleep(3000);
                System.out.println(name + "  finish hear thing");
                lock.unlock();
            } catch (InterruptedException e) {
            }

        } else {
            System.out.println(name + " dont want wait");

        }
    }
}