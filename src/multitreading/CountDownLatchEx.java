package multitreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff come to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch =" + countDownLatch.getCount());
    }

    private static void everyThingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Every thing is ready, so lat`s get open market ");
        countDownLatch.countDown();
        System.out.println("countDownLatch =" + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch =" + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
    new Friend("Filip", countDownLatch);
    new Friend("Taras", countDownLatch);
    new Friend("Vitia", countDownLatch);
    new Friend("Grisha", countDownLatch);
    new Friend("Piter", countDownLatch);
    marketStaffIsOnPlace();
    everyThingIsReady();
    openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " som friend start to bye");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}