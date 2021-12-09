package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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
        /*List<Integer> courses = studentsArrayList.stream().mapToInt(el ->
                el.getAge()).boxed().collect(Collectors.toList());
        System.out.println(courses);*/
        /*Student min = studentsArrayList.stream().min((x,y)->x.getAge()-y.getAge()).get();
        Student max = studentsArrayList.stream().max((x,y)->x.getAge()-y.getAge()).get();
        System.out.println(max);*/
       /* studentsArrayList.stream().filter(e->e.getAge()>20).forEach(System.out::println);
        System.out.println("---------------------------------");
        studentsArrayList.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);
        System.out.println("---------------------------------");
        studentsArrayList.stream().filter(e->e.getAge()>20).skip(2).forEach(System.out::println);*/
        //int sum = studentsArrayList.stream().mapToInt(el-> el.getCourse()).sum()
        /*double avarege = studentsArrayList.stream().mapToDouble(el-> el.getCourse()).average().getAsDouble();
        System.out.println(avarege);*/
        int min = studentsArrayList.stream().mapToInt(el-> el.getCourse()).min().getAsInt();
       // System.out.println(min);
        int max = studentsArrayList.stream().mapToInt(el-> el.getCourse()).max().getAsInt();
        System.out.println(max);
    }
}
