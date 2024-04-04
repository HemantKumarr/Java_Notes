package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(4,3,4,6,5,2);
//        int[] marks = {3,4,5,6};
        System.out.println(marks.stream().count());
            int y=3;
        List<Integer> marksSquare = marks.stream().map(x->x*y ).collect(Collectors.toList());
        System.out.println(marksSquare);
        System.out.println(marks.stream().map(x->x*y ));
        List<Integer> distinct = marks.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        float sum = marks.stream().reduce(0, (total,i)->total+i); // total is initialized with value 0.
        System.out.println(sum);

        List<Integer> disEvenMarksSorted = marks.stream().distinct().filter(x->x%2!=0).map(x->x*x).sorted().collect(Collectors.toList());
        System.out.println(disEvenMarksSorted);
    }
}
