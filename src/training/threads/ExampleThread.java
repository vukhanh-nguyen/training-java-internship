package training.threads;

public class ExampleThread extends Thread {

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
        ExampleThread thread1 = new ExampleThread();
        ExampleThread thread2 = new ExampleThread();

        // Example to see sleep thread
        thread1.start();
        thread2.start();

        //Example thread join

        ExampleThread thread3 = new ExampleThread();
        ExampleThread thread4 = new ExampleThread();
        ExampleThread thread5 = new ExampleThread();
        while (thread1.isAlive() || thread2.isAlive()) {
            // Do nothing
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread4.start();
        thread5.start();

    }
}
