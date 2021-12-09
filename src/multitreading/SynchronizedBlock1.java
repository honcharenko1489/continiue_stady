package multitreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImplementation1 runnable = new MyRunnableImplementation1();
        Thread tr = new Thread(runnable);
        Thread tr1 = new Thread(runnable);
        Thread tr2 = new Thread(runnable);
        tr.start();
        tr1.start();
        tr2.start();
    }
}
class Counter2{
    static int count;
}
class MyRunnableImplementation1 implements Runnable{
    private void doWork2(){
        System.out.println("hoooray");
    }

    private void doWork1(){
        doWork2();
        synchronized (this){
            Counter2.count++;
            System.out.println(Counter2.count);
        }


    }
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            doWork1();
        }
    }
}
