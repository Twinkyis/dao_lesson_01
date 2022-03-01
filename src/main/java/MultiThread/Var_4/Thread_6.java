package MultiThread.Var_4;

public class Thread_6  implements Runnable{
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Thread thread6 = new Thread(new Thread_6());
        thread6.start();

            for (int i = 1000; i>0; i--) {
                System.out.println(i);
            }
    }
}
