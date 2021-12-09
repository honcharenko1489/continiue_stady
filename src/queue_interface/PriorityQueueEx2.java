package queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student st = new Student("Petia", 3);
        Student st1 = new Student("katia", 2);
        Student st2 = new Student("Oleg", 4);
        Student st3 = new Student("Masha", 5);
        Student st4 = new Student("Taras", 1);
        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(st);
        pq1.add(st1);
        pq1.add(st2);
        pq1.add(st3);
        pq1.add(st4);
        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
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