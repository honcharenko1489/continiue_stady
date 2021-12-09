package multitreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method  main begins");
        Thread th = new Thread(new Worker());
        System.out.println(th.getState()  );
        th.start();
        System.out.println(th.getState()  );
        th.join();
        System.out.println(th.getState()  );
        System.out.println("Method maid finish");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Job is dun");
    }
}
