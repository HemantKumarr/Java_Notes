package Multithreading;

public class ThreadMain {
    public static void main(String[] args) {

        ThreadSample ts = new ThreadSample();
        ts.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main " + i);
        }

        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
// change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);

    }
}
