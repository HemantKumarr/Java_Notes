package Exceptions;

public class User {
    int age;
    String name;

    public User() {
    }

    public User(int age, String name) throws InvalidAgeException {
        this.age = age;
        this.name = name;
        if(this.age<18){
            throw new InvalidAgeException("Age should be greater than 18 - " + age + " xvdf "  + age + " xvdf");
        }
    }
}
