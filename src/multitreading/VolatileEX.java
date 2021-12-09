package multitreading;

public class VolatileEX extends Thread {
   volatile boolean b=true;


    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("loop  is  finished. counter = "+counter);
    }

    public static void main(String[] args) throws InterruptedException {
    VolatileEX vex = new VolatileEX();
    vex.start();
    Thread.sleep(3000);
        System.out.println("after 3 seconds it  is time to wake  up!");
        vex.b= false;
        vex.join();
        System.out.println("And of programm");
    }
}
