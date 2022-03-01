package MultiThread.Var_3;

public class Thread_5 extends Thread{

    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Thread_5 thread_5 = new Thread_5();
        thread_5.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
