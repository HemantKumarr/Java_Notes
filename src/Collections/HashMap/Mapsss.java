package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Mapsss {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"John");
        Employee e2 = new Employee(2,"Ali");
        Employee e3 = new Employee(1,"John");
        Employee e4 = new Employee(1,"John");
        HashMap<Employee,Integer> hm = new HashMap<>();

        hm.put(e1,23);
        hm.put(e2,99);
        hm.put(e3,78);
        hm.put(e4,78);
        System.out.println(hm.size());

        for (Map.Entry<Employee,Integer> entry : hm.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }
}
