package multitreading;

public class Eex10 {
    public static void main(String[] args) {
        MyRunnableImplementation runnable = new MyRunnableImplementation();
        Thread tr = new Thread(runnable);
        Thread tr1 = new Thread(runnable);
        Thread tr2 = new Thread(runnable);
        tr.start();
        tr1.start();
        tr2.start();
    }
}
class Counter{
    static int count;
}
class MyRunnableImplementation implements Runnable{
    public synchronized void incriment(){
        Counter.count++;
        System.out.print(Counter.count+" ");

    }
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            incriment();
        }
    }
}