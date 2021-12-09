package work_with_files.proggrammer1;

import java.io.Serializable;

public class Employees implements Serializable {
    final static  long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    int age;
    transient double salary;
    Car car;

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
               // ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

    public Employees(String name, String surname, String department,
                     //int age,
                     double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
       //this.age = age;
        this.salary = salary;
        this.car = car;
    }
}
