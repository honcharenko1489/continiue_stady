package regex;

public class PrintFExample {
    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t \t Ok %-12s %,.1f\n", emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Serhii", "Honcharenko", 10000, 0.35);
        Employee emp2 = new Employee(2, "Ivan", "Petrov", 1000, 0.34);
        Employee emp3 = new Employee(3, "Lada", "Kalina", 500, 0.31);


         /*   employeeInfo(emp1);
            employeeInfo(emp2);
            employeeInfo(emp3);*/

        String st = String.format("%03d \t %-12s \t \t %-12s %,.1f\n"
                , 1, "Serhii", "Honcharenko",  10000*(1+0.35));
        System.out.println(st);
        //System.out.printf("String  must be left position and second parameter must to round up to ten","hi","741.117");
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
