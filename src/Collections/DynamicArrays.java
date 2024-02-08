package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DynamicArrays {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(1);
        al.add(10);

        for(Iterator iter = al.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("---------");
        Collections.sort(al,Collections.reverseOrder());
        for(Iterator iter = al.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("---------");
//        Integer i = 1;  // Removes the element 1 from the array since i value is an object.
        int i=1;    // Removes the element at index 1 from the array.
        al.remove(i);
        for(Iterator iter = al.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

        int p =(int) 34.3;
        System.out.println(p);
// local var are not initialized by JVM.
        int j=7;
        int k = ++j;
        System.out.println(j +" " + k);
        j++;
        System.out.println(j);
    }
}
