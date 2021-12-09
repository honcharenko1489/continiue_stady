package reflection_examples;

import java.lang.reflect.Field;

public class Example3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee em = new Employee(1, "Serhii", "IT");
        Class employeeClass = em.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double)field.get(em);
        System.out.println(salaryValue);
        field.set(em, 5000);
        System.out.println(em);
    }
}
