package StaticNonStatic;

public class Emp extends Person {
    public void display(){
        System.out.println("In emp");
    }
}

class test{
    public static void main(String[] args) {
        Emp e = new Emp();
        e.display();

        Person p= new Person();
        p.display();

        Person p1 = new Emp();
        p1.display();
    }
}
