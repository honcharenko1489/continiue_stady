package alishev;

public class Lesson24 {

    public static void main(String[] args) {
        HumanMen humanMen = new HumanMen("Ron", 31);
        System.out.println(humanMen.toString());
    }
}

class HumanMen {
    public HumanMen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "HumanMen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}