package Collections;

import java.util.Objects;

public class Students implements Comparable<Students> {
    int rollNo;
    String name;
    float percent;

    public Students(int rollNo, String name, float percent) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo &&
                Float.compare(students.percent, percent) == 0 &&
                Objects.equals(name, students.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(rollNo, name, percent);
//    }

    @Override
    public int compareTo(Students o) {
        if(this.percent>o.percent) return 1;
        else if(this.percent<o.percent) return -1;
        return 0;
    }
}
