package Multithreading;

public class TableThreadRunnable implements Runnable {

    int num;

    public TableThreadRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.println( num + " X " + i + " = " + num*i);

        }
    }
}
