package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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
       /* Map<Integer, List<Student>> map = studentsArrayList.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el -> el.getCourse()));
        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue().toString());
        }*/
        Map<Boolean, List<Student>> map =
                studentsArrayList.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
