package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("reflection_examples.Employee");

        Constructor constructor1 = employeeClass.getConstructor();
        Object obj1 = constructor1.newInstance();
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class,  String.class);
        Object obj2 = constructor2.newInstance(5, "Tolik", "Podol");
        System.out.println(obj2);
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);
        System.out.println(obj2);
    }
}
