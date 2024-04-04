package Multithreading;

public class MyThread extends Thread{

    School school;
    String name;

    public MyThread(School school, String name) {
        this.school = school;
        this.name = name;
    }

    public void run(){
        school.display(name);

    }

}
