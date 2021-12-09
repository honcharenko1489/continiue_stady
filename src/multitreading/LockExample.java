package multitreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
    Call call = new Call();
    Thread tr1 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.mobileCall();
        }
    });
    Thread tr2= new Thread(new Runnable() {
        @Override
        public void run() {
            call.skypeCall();
        }
    });
    Thread tr3 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.whatsappCall();
        }
    });
    tr1.start();
    tr2.start();
    tr3.start();
    }
}
class Call{
    private Lock lock = new ReentrantLock();
    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile code starts");
            Thread.sleep(3000);
            System.out.println("Mobile code ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype code starts");
            Thread.sleep(5000);
            System.out.println("Skype code ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void whatsappCall(){
        lock.lock();
        try {
            System.out.println("Whatsapp code starts");
            Thread.sleep(7000);
            System.out.println("Whatsapp code ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}