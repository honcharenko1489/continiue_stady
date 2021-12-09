package nested_classes.inner_class;


public class Car {
    String color;
    static int countDoor;
    Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My  car{" +
                "color='" + color + '\'' +
                ", countDoor=" + countDoor +
                ", engine=" + engine +
                '}';
    }

    public Car(String color, int countDoor) {
        Engine e = new Engine(500);
        System.out.println(e.horsePower);
        this.color = color;
        this.countDoor = countDoor;
        //this.engine = this.new Engine(horsePower);
    }

    public class Engine {

        private int horsePower;

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            System.out.println(countDoor);
            this.horsePower = horsePower;
        }
    }
}

class Test {
    public static void main(String[] args) {
       ;
        Car ca = new Car("black", 5);
        Car.Engine eng = ca.new Engine(85);
        ca.setEngine(eng);
        System.out.println(eng);
        System.out.println(ca);
        Car.Engine eng1 = new Car("red", 3).new Engine(150 );

    }
}