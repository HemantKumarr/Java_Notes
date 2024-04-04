package Multithreading;

public class TableMain {
    public static void main(String[] args) {
        TableThreadRunnable t = new TableThreadRunnable(5);

        Thread t1 = new Thread(t, "Table of 5");
        System.out.println(t1.getId()+ " " + t1.getName());
        t1.setDaemon(true);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        TableThreadRunnable t2 = new TableThreadRunnable(7);

        Thread t3 = new Thread(t2, "Table of 7");
        System.out.println(t3.getId()+ " " + t3.getName());
        System.out.println(t3.getState());
        t3.start();
        System.out.println(t3.getState());

        String s = "dsf";
        String s1 = new String("sdf");
    }
}
