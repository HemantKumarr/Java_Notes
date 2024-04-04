package Multithreading;

public class ThreadSample extends Thread{


    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " Thread id " + this.getId() +" " + i);
        }
    }

}
