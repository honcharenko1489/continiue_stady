package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Mykola", 'm', 20, 2, 9.3);
        Student s3 = new Student("katia", 'f', 18, 1, 7.1);
        Student s4 = new Student("Alisa", 'f', 24, 4, 7.8);
        Student s5 = new Student("Roman", 'm', 25, 5, 6.2);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(s1);
        f1.addStudentToFaculty(s2);
        f1.addStudentToFaculty(s3);
        f2.addStudentToFaculty(s4);
        f2.addStudentToFaculty(s5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentOnFaculty().stream()).forEach(e-> System.out.println(e.getName()));
    }

}
class Faculty{
    String name;
    List<Student> studentOnFaculty;

    public List<Student> getStudentOnFaculty() {
        return studentOnFaculty;
    }

    public Faculty(String name) {
        this.name = name;
        studentOnFaculty = new ArrayList<>();
    }

    public void addStudentToFaculty(Student st){
    studentOnFaculty.add(st);
    }
}