package multitreading;

public class Ex3 implements Runnable {

    public static void main(String[] args) {
        for (int i=1; i<1000; i++){
            System.out.println(i);
        }
    Thread tr = new Thread(new Ex3());
    tr.start();
    }

    @Override
    public void run() {
        for (int i=1; i<1000; i++){
            System.out.println(i);
        }
    }
}
