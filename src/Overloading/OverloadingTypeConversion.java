package Overloading;

public class OverloadingTypeConversion {

    void test() {
        System.out.println("No parameters");
    }
    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);

    }
    // Overload test for a double parameter
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}
 class OverloadTypeCast {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i); // this will invoke test(double)
//  Java can automatically convert an integer into a double, and this conversion can be used to resolve the call. Therefore, after
//  test(int) is not found, Java elevates i to double and then calls test(double)
        ob.test(123.2); // this will invoke test(double)
    }
}
