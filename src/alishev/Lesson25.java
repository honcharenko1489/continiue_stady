package alishev;

import alishev.fofest.tree.Tree;

public class Lesson25 {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("-----------------------");
        Dog dog  = new Dog();
        dog.eat();
        dog.sleep();
        dog.dogEat();
        dog.dogSleep();
        System.out.println(dog.toString());
        dog.bark();
        dog.showName();
        dog.name="Bobic";
        dog.showName();*/
        Animal  an = new Dog();
        an.showName();
        Dog dd = (Dog)new Animal();
        dd.showName();
        Tree  t=  new Tree();
    }
}
