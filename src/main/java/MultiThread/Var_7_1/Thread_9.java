package MultiThread.Var_7_1;

public class Thread_9 {
    public static void main(String[] args) {

        Thread9 thread9 = new Thread9();

        thread9.setName("Num_1");
        thread9.setPriority(7);
        System.out.println("name " + thread9.getName() + " priority " + thread9.getPriority());

        Thread9 thread11 = new Thread9();
        System.out.println("name " + thread11.getName() + " priority " + thread11.getPriority());
    }
}

class Thread9 extends Thread{
    public void run() {
        System.out.println("privet");
    }
}