import java.util.Objects;
import java.util.TreeSet;

public class TreeSatEx2 {
    public static void main(String[] args) {
        TreeSet<Student> tsu = new TreeSet<>();
        Student  st = new Student("Petia", 3);
        Student  st1 = new Student("katia", 2);
        Student  st2 = new Student("Oleg", 4);
        Student  st3 = new Student("Masha", 5);
        Student  st4 = new Student("Taras", 1);
        tsu.add(st);
        tsu.add(st1);
        tsu.add(st2);
        tsu.add(st3);
        tsu.add(st4);
        System.out.println(tsu);
        Student  st5 = new Student("Grisha", 5);
        Student  st6 = new Student("Pardon", 3);
      //  System.out.println(tsu.first());
      //  System.out.println(tsu.last());
        System.out.println(tsu.subSet(st6, st5));
        System.out.println(st.equals(st6));
        System.out.println(st.hashCode());
        System.out.println(st6.hashCode());
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
