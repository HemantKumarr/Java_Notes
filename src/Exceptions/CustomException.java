package Exceptions;

public class CustomException  {
    public static void main(String[] args)   {
        try {
            User u = new User(5, "Sdf");
            System.out.println("jhhv");
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
          e.printStackTrace();

            System.out.println(e.toString());
        }
    }
}
