package MultiThread.Car_Racing;

public class Main {
    public static void main(String[] args) {


        Thread thread0 = new Thread(new Car_0());
        Thread thread1 = new Thread(new Car_1());
        Thread thread2 = new Thread(new Car_2());
        Thread thread3 = new Thread(new Car_3());
        Thread thread4 = new Thread(new Car_4());
        Thread thread5 = new Thread(new Car_5());
        Thread thread6 = new Thread(new Car_6());
        Thread thread7 = new Thread(new Car_7());
        Thread thread8 = new Thread(new Car_8());
        Thread thread9 = new Thread(new Car_9());


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread0.start();
    }
}
