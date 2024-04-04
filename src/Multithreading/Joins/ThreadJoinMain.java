package Multithreading.Joins;

public class ThreadJoinMain {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();

        t1.start();
        try {
            System.out.println(Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            System.out.println(Thread.currentThread().getName());
            t2.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
