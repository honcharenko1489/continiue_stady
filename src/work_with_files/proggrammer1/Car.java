package work_with_files.proggrammer1;

import java.io.Serializable;

public class Car implements Serializable {
String name;
String model;
String color;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
}
