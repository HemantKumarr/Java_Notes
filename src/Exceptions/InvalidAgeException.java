package Exceptions;

public class InvalidAgeException extends Exception {
    String message;

//    @Override
//    public String toString() {
//        return "InvalidAgeException{" +
//                "message='" + message + '\'' +
//                '}';
//    }

    public InvalidAgeException(String message3) {
        super(message3);
        this.message=message3;
    }

    public String toString(){
        return "Invalid  Age  Exception " + message;
    }
}
