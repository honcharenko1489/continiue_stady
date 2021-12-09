package multitreading;

public class Ex6 implements Runnable{
    public static void main(String[] args) {
        Thread tr = new Thread(new Ex6());
        tr.run();
        System.out.println("Metod run. name Thread = "+ Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Metod main name Thread = "+ Thread.currentThread().getName());
    }
}
