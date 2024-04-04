package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsArrayList {

    public static void main(String[] args) {
        Students s1 = new Students(1,"Sam",90);
        Students s2 = new Students(2,"Jon",95);
        Students s3 = new Students(3,"Ali",80);
        System.out.println(s1.getClass());
        ArrayList<Students> al = new ArrayList<>();
        al.add(s2);
        al.add(s1);
        al.add(s3);

        for (Students s:al ) {
            System.out.println(s);
        }

        Collections.sort(al);

        for (Students s:al ) {
            System.out.println(s);
        }

        Collections.sort(al, new RollNoComparator());
        for (Students s:al ) {
            System.out.println(s);
        }
    }
}
