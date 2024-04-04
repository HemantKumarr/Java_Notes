package Singleton;

public class Singletonn {

    private static Singletonn instance;

    private Singletonn(){
        System.out.println("in constructor");
    }

    public static Singletonn getInstance(){
        if(instance==null){
            instance=new Singletonn();
        }
        return instance;
    }

    public static void dbConnect(){
        System.out.println("DB connected");
    }
}

//public class Test2 {
//    public static void main(String[] args) {
//        Singletonn s;
//        s = Singletonn.getInstance();
//    }
//}
