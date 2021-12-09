package annotation_examples;

public class Test1 {
    public static void main(String[] args) {
    Parent p = new ChildClass("Serhii");
    p.showInfo();
    }
}
class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
    @Deprecated
    void showInfo(){
        System.out.println( "It`s  Parent  class. Name  = "+ name);
    }
}
class ChildClass extends Parent{
    public ChildClass(String name) {
        super(name);
    }
    @Override
    void showInfo(){
        System.out.println("It`s  child class. Name = "+ name);
    }
}