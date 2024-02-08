package Exceptions;

public class TryFinally {

    public static void main(String[] args) {
        System.out.println(method());
    }

    private static boolean method() {

        try{
            System.out.println("In try");}
//            System.exit(0);
//            return false;

        finally {
            System.out.println("In finally");
        }
        return true;
    }
}
