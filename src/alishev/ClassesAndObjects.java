package alishev;

public class ClassesAndObjects {
    public static void main(String[] args) {
        /*Human.description = "all is ok";
        Human human = new Human("Gadzila", 2000);
        Human human1 = new Human("karina", 100);
        human.getAllFields();
        human.printNumberOfPeople();
        Human.description = "so-so";
        human1.getAllFields();
        human1.printNumberOfPeople();
        Human human2 = new Human("Klian", 200);
        human2.printNumberOfPeople();*/
       /* String s1 = "Hello";
        String s2 = " my ";
        String s3 = "friend";
        String all = s1+s2+s3;
        System.out.println(all);*/
        /*float ff = 2.3f;
        int k = 555;
        String a = "NOT bad";
        System.out.printf("%f this is %s a string,  %d", ff, a, k);*/
        System.out.printf("Trulialia %-10d\n", 532);
        System.out.printf("Trulialia %-10d\n", 100000532);
        System.out.printf("Trulialia %-10d\n", 53);
        System.out.printf("Trulialia %-10d\n", 1302775992);

        /*StringBuilder sb = new StringBuilder("Sisichki");
        System.out.println(sb.toString());
        sb.append(" my ").append(" favorite");
        sb.append(" chois");
        System.out.println(sb.toString());*/

        /*
        human.setName("Artur");
        human.setAge(89);

        System.out.println();*/
       /* human.setAge(40);
        human.setName("Kristi");
        human.getInfo();*/


       /* Person person = new Person();
        //person.name = "Oleg";
        person.setAge(18);
        // person.showNAmeAndAge();
        Person person1 = new Person();
        person1.setAge(30);
        System.out.println(person.getAge());
        person1.setName("Alehandro");
        //person1.showNAmeAndAge();
//        person1.sayHello();
        person.setName("");
//        person.showNAmeAndAge();
        // person.calculateYearsToRetirement();
//        int year1 = person.calculateYearsToRetirement();
//        System.out.println("for person to retirement years is  : " + year1);
//        System.out.println(person1);
        System.out.println("My name is " + person.getName());


//        System.out.println(person);*/
    }
}

class Person {
    private String name;
    private int age;


    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("You write a zero name");
        } else {

            this.name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("not true age");
        } else {

            this.age = userage;
        }

    }

    public int getAge() {
        return age;
    }

    /*void setName(String username){
        this.name=username;
//        System.out.println("nickName is: "+nickName);
    }*/

    void showNAmeAndAge() {

        System.out.println("My name is: " + name + ", my age is " + age);


    }

    void sayHello() {
        System.out.println("Hello " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    int calculateYearsToRetirement() {
        int result = 60 - age;
        //System.out.println("to retirement u mast work: "+result);
        return result;

    }
}

class Human {
    private String name;
    private int age;
    public static String description;
    private static int countPeople;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        countPeople++;
        this.name = name;
        this.age = age;
    }

    /*    public void setName(String name){
            this.name=name;
        }
        public String  getName(){
            return name;
        }
        public void setAge(int age){
            this.age= age;
        }
        public int getAge(){
            return age;
        }*/
    public static void getDescription() {
        System.out.println(description);
    }

    void getInfo() {
        System.out.println("my  name is : " + name + "  my  age is " + age);
    }

    public void getAllFields() {
        System.out.println("name = " + name + ", age is: " + age + " and it is " + description);
    }
    public  void printNumberOfPeople(){
        System.out.println("count of our people is : "+countPeople);
    }
}