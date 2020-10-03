package training.threads;

public class ExampleRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Sleep in 2s
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExampleRunnable());
        Thread t2 = new Thread(new ExampleRunnable());
        t1.start();
        t2.start();
    }
}
