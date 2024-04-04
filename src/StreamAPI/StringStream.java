package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StringStream {
    public static void main(String[] args) {

        List<String> country = Arrays.asList("India","USA", "UK");

        country.stream().filter(a ->startsWithTest(a,"U")).forEach(System.out::println);
        System.out.println("------");
        country.stream().filter(a ->startsWithTest(a,"U")).forEach(new StringStream()::printer);  // since printer is non-static method, we are accessing it by class object
        System.out.println("------");
        country.stream().filter(a ->startsWithTest(a,"U")).forEach(s->System.out.println(s));
        System.out.println("------");
//        boolean b = StringStream::startsWithTest("Udsf",'U');

        for (String a : country) {
            if (startsWithTest(a, "U")) {
                System.out.println(a);
            }
        }

        String concatt = country.stream().reduce("", (str1,str2)-> str1 + " - " + str2);
        System.out.println(concatt);
    }
    public static boolean startsWithTest(String str, String c){
        return str.startsWith(c);
    }

    public void printer(String s){
        System.out.println(s);
    }
}
