package Multithreading.Joins;

public class ThreadJoinDemo extends Thread{

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +" " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
