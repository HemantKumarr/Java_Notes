package Multithreading;

public class School {

    public void display(String name) {
        synchronized (School.class ) {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " " + i);
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
}
