/* Java program to show that if static method is redefined by
a derived class, then it is not overriding. */

// Superclass
class Base {

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void print() {
        System.out.println("Non-static or Instance method from Base");
    }
}

// Subclass
class Derived extends Base {

    // This method is hidden by display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }
}

// Driver class
public class StaticOverloading {
    public static void main(String[] args) {
        Base obj1 = new Derived();

        // As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        obj1.display();

        // Here overriding works and Derive's print() is called
        obj1.print();


        System.out.println("------");
        Derived obj2 = new Derived();
        obj2.display();
        obj2.print();
    }
}

// No. Static methods in Java cannot be overridden. This is because static methods are not associated with the instance of a class, but with the class itself.
// Therefore, when a subclass inherits a static method from its parent class, it cannot modify the behavior of the static method in any way
// The following are some important points for method overriding and static methods in Java.
//     For class (or static) methods, the method according to the type of reference is called, not according to the object being referred, which means method call is decided at compile time.
//     For instance (or non-static) methods, the method is called according to the type of object being referred, not according to the type of reference, which means method calls is decided at run time.
//     An instance (or non-static) method cannot override a static method, and a static method cannot hide an instance (or non-static) method. Throws compiler errors. i.e. a static method in parent class must be declared as static in child class also and a non-static method must be declared as non-static in child class.
//     In a subclass (or Derived Class), we can overload the static methods inherited from the superclass. Such overloaded methods neither hide nor override the superclass methods — they are new methods, unique to the subclass.

