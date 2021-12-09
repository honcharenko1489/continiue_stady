package multitreading;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hii");
            }
        }).start();

        new Thread(()-> System.out.println("Okey")).start();
    }
}
