package nested_classes.static_nested_class;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String color;
    int countDoor;
   private  static int a;


    @Override
    public String toString() {
        return "My  car{" +
                "color='" + color + '\'' +
                ", countDoor=" + countDoor +
                ", engine=" + engine +
                '}';
    }

    public Car(String color, int countDoor, Engine engine) {
        this.color = color;
        this.countDoor = countDoor;
        this.engine = engine;
    }
    void method(){
        Engine en = new Engine(112);
        System.out.println(en.horsePower);
    }

    Engine engine;
    public static class Engine{

       private int horsePower;
        static int countOfElement;
        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            System.out.println(a);
            System.out.println();
            this.horsePower = horsePower;
            countOfElement++;
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(100);
        System.out.println(e);
        Car car = new Car("red", 2, e);
        System.out.println(car);
    }
}
/*
class Z extends Car.Engine {
    Z(){super(200);
    }
}*/
