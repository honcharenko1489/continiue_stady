package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student("Ivanyc", 'm', 22, 3, 8.3);
        Student stu2 = new Student("Mykolaich", 'm', 20, 2, 9.3);
        Student stu3 = new Student("katiaha", 'f', 18, 1, 7.1);
        Student stu4 = new Student("Alisandra", 'f', 24, 4, 7.8);
        Student stu5 = new Student("Romario", 'm', 25, 5, 6.2);
        List<Student> lsu = new ArrayList<>();
        lsu.add(stu1);
        lsu.add(stu2);
        lsu.add(stu3);
        lsu.add(stu4);
        lsu.add(stu5);
       /* lsu.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).filter(el -> el.getSex() == 'f').
                 sorted((x, y) -> x.getAge() - y.getAge()).
                forEach(System.out::println);*/

        Student first = lsu.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).filter(el -> el.getSex() == 'f').
                sorted((x, y) -> x.getAge() - y.getAge()).findFirst().get();
        System.out.println(first);

     /*  lsu =  lsu.stream().sorted(  (x, y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(lsu);*/
        /*lsu =  lsu.stream().filter(el->el.getAge()<22&&el.getAvgGrade()<7.2).collect(Collectors.toList());
        System.out.println(lsu);*/
      /*  Stream<Student> myStream = Stream.of(stu1, stu2, stu3,stu4,stu5);
       myStream.filter(el->el.getAge()<20).collect(Collectors.toList());
        System.out.println(myStream.toString());*/
    }
}

class Student {


    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }


    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}