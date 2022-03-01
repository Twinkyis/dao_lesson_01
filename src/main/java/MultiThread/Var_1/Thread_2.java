package MultiThread.Var_1;

public class Thread_2 extends Thread{

    public void run() {
        for (int i = 1000; i>0; i--) {
            System.out.println(i);
        }
    }
}
