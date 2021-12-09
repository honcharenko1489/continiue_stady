package alishev.interfases;

public class Test1 {

    public static void main(String[] args) {
    Animal a = new Animal(1);
    Person p = new Person("Hero");/*
        a.sleep();
        p.sayHallo();
        a.infoShow();
        p.infoShow();*/
        /*ShowInfo info = new Animal(1);
        ShowInfo info1 = new Person("KOKOKO");*/
      outputInfo(a);
      outputInfo(p);

    }
    public static void outputInfo(ShowInfo  sh){
        sh.infoShow();
    }
}
