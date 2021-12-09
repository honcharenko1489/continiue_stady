package alishev;

import java.util.Objects;

public class Animal {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
/*  @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }*/
    /*public String name="userAnimal";
    public void showName(){
        System.out.println("name animal"+name);
    }
    public void eat(){
        System.out.println(" Animal  is eating...");
    }
    public void sleep(){
        System.out.println(" Animal  is sleeping...");
    }*/
}
