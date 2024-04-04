package Multithreading;

public class MainTest {
    public static void main(String[] args) {
        School sch = new School();
        School sch1 = new School();
        School sch2 = new School();

        MyThread t1 = new MyThread(sch,"Aditya");
        MyThread t2 = new MyThread(sch1,"Rohan");
        MyThread t3 = new MyThread(sch,"John");

        t1.start();
        t2.start();
        t3.start();

    }
}
