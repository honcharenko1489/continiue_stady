package multitreading;

public class Ex12 {
    final static Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call  starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MobileCall ands");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call  starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype Call ands");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println(" whatsapp call  starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" whatsapp Call ands");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplementationMobile());
        Thread thread2 = new Thread(new RunnableImplementationSkype());
        Thread thread3 = new Thread(new RunnableImplementationWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class RunnableImplementationMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplementationSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplementationWhatsapp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}

