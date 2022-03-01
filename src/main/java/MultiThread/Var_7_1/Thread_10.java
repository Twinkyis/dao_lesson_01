package MultiThread.Var_7_1;

public class Thread_10 implements Runnable{
    public void run() {
        System.out.println("Mth run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Thread_10());
        thread.start();
        System.out.println("Mth main. Thread name = " + Thread.currentThread().getName());
    }
}
