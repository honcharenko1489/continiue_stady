package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
/*
      void printStudentsOverGrade(ArrayList<Students> al, double grade){
          for (Students s: al) {
              if (s.avgGrade>=grade){
                  System.out.println(s);
              }
          }
      }
    void printStudentsUnderAde(ArrayList<Students> al, int age){
        for (Students s: al) {
            if (s.age<age){
                System.out.println(s);
            }
        }
    }
    void printStudentMixCondition(ArrayList<Students> al, int age, double grade, char sex){
        for (Students s: al) {
            if (s.age>age&&s.avgGrade<grade&&s.sex==sex){
                System.out.println(s);
            }
        }
    }*/
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Mykola", 'm', 20, 2, 9.3);
        Student s3 = new Student("katia", 'f', 18, 1, 7.1);
        Student s4 = new Student("Alisa", 'f', 24, 4, 7.8);
        Student s5 = new Student("Roman", 'm', 25, 5, 6.2);
        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(s1);
        studentsArrayList.add(s2);
        studentsArrayList.add(s3);
        studentsArrayList.add(s4);
        studentsArrayList.add(s5);

        StudentInfo studentInfo = new StudentInfo();
        /*Collections.sort(studentsArrayList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.sex-o2.sex;
            }
        });*/
       /* Collections.sort(studentsArrayList, (o1, o2)->(o1.course- o2.course));
        System.out.println(studentsArrayList);*/
     /*   studentInfo.testStudents(studentsArrayList, new StudentCheks() {
            @Override
            public boolean check(Students s) {
                return s.age<21;
            }
        });*/
      /*  studentInfo.testStudents(studentsArrayList, (Students s) -> {
            return s.age < 20;
        });
        System.out.println("________________________");
        studentInfo.testStudents(studentsArrayList, s -> {
            System.out.println("Hii");
            return s.age < 20;
        });
        System.out.println("________________________");
        studentInfo.testStudents(studentsArrayList, (Students s) -> {
            return s.sex == 'm' && s.age > 20 && s.avgGrade > 7.0;
        });
        System.out.println("________________________");
        // studentInfo.testStudents(studentsArrayList,  (Students s))->{ return s.sex=='f'; });
        studentInfo.testStudents(studentsArrayList, (Students s) -> {
            return s.sex == 'f';
        });*/
       /* System.out.println("________________________");
        Predicate<Students> p1 = students  ->students.avgGrade < 8.0;
        Predicate<Students> p2 = students  ->students.sex =='f';

        studentInfo.testStudents(studentsArrayList, p1.negate());*/
        //studentInfo.testStudents(studentsArrayList, p2);
        /*studentInfo.printStudentsOverGrade(studentsArrayList, 8);
        System.out.println("________________________");
        studentInfo.printStudentsUnderAde(studentsArrayList, 21);
        System.out.println("------------------------");
        studentInfo.printStudentMixCondition(studentsArrayList, 22, 8, 'm');*/
        Function<Student, Double> fun = student-> student.avgGrade;
        double res = avgOfSomething(studentsArrayList,  stud->(double)stud.course);
        System.out.println(res);
    }
    private static double avgOfSomething(List<Student> ls, Function<Student, Double>fsd ){
    double result =0;
    for (Student s: ls){
        result+= fsd.apply(s);
    }
    result = result/ls.size();
     return result;
    }
}

interface StudentCheks {
    boolean check(Student s);
}
/*
class CheckOverGrade implements StudentCheks{

    @Override
    public boolean check(Students s) {
        return s.avgGrade>8;
    }
}*/
