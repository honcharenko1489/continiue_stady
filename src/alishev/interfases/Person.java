package alishev.interfases;

public class Person implements ShowInfo{
    public String name;

    @Override
    public void infoShow() {
        System.out.println("name is : "+ name);
    }

    public void sayHallo(){
        System.out.println("hello");
    }

    public Person(String name) {
        this.name = name;
    }
}
