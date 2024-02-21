package HashMap;

import java.util.HashMap;

public class Mapsss {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"John");
        Employee e2 = new Employee(2,"Ali");
        Employee e3 = new Employee(1,"John");
        Employee e4 = new Employee(1,"John");
        HashMap<Object,Integer> hm = new HashMap<>();

        hm.put(e1,23);
        hm.put(e2,99);
        hm.put(e3,78);
        hm.put(e4,78);
        System.out.println(hm.size());


    int a=4,c=4;
    if(++a==c) {
        System.out.println("equal");

    }
    }
}
