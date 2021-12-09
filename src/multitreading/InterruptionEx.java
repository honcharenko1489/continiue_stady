package multitreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterruptedThread it = new InterruptedThread();
        it.start();
        Thread.sleep(2000);
        it.interrupt();
        it.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Some body  want to stop  thread");
                System.out.println("we  think  together  and  want to stop  thread");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread some body wants stoped wen sleeping");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}