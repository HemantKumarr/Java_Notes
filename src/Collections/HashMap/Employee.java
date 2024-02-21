package HashMap;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    int c=0;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        c++;
//        System.out.println("In equals" + c);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);

    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(id, name));
        return Objects.hash(id, name);
    }
}
