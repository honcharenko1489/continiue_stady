package multitreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial2 fac = new Factorial2(6);
        Future<Integer> future = service.submit(fac);
        try {
            System.out.println(future.isDone());
            System.out.println("we want to gat result");
            factorialResult = future.get();
            System.out.println("have the result");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            service.shutdown();
        }
        System.out.println(factorialResult);
        /*
        service.shutdown();
        System.out.println(factorialResult);*/
    }
}

class Factorial2 implements Callable<Integer> {
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("You  wrote  not  right number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(100);
        }
        return result;
    }
}