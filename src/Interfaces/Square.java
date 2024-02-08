package Interfaces;

public class Square extends Shape implements Area{

    int side;
//    @Override
    public void area() {
        this.area=side*side;
        System.out.println(this.area);
        Area.display();
        System.out.println(Area.a);

    }
//    Area.d

    public void test() {
        System.out.println("dfggdr");
    }
}
