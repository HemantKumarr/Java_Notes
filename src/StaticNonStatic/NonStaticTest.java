package StaticNonStatic;

public class NonStaticTest {
    static String var = "dgf";
    String var2 = "dfgdg";
     static void func(){
         System.out.println("In func");
     }
     void func2(){
         System.out.println("In func2");

     }

}
class Staticc{
    public static void main(String[] args){
        System.out.println(NonStaticTest.var);
        NonStaticTest n = new NonStaticTest();
        n.func();
        NonStaticTest.func();
        caller();
    }
    static void caller(){
        NonStaticTest n = new NonStaticTest();
        System.out.println(n.var2);
        n.func();
        n.var="bj";
    }
}
