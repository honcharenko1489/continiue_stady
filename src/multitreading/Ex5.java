package multitreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 tr5 = new MyThread5();
        tr5.setName("Kakaha");
        tr5.setPriority(9);
        System.out.println(" Name thread = "+tr5.getName()+" Priority trad = "+tr5.getPriority());

     /*   MyThread5 tr6 = new MyThread5();
        System.out.println(" Name thread = "+tr6.getName()+" Priority trad = "+tr6.getPriority());*/

    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Kuku");

    }
}