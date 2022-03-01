package MultiThread.Car_Racing;

public class Car_5 implements Runnable{
    @Override
    public void run() {

        Car_builder car_builder = new Car_builder();
        car_builder.setName("Mazda");

        System.out.println("Preparing...");

        int i;
        boolean d = false;

        int a = (int) (Math.random() * 150);

        for (i = a; i > 0; i--) {
        }
        if (i < 1) {
            d = true;
        }
        System.out.println("Mazda Ready!");
    }
}
