package alishev.fofest.tree;

import java.util.ArrayList;
import java.util.List;

/*class OtherAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("Other animal is eating");
    }
}*/
interface  AnimalJ{
    public void eat();
}
public class Test2 {
    /*  private static void test(List<? extends Animal> al){
          for (Animal an: al){
              an.eat();
          }
      }*/
    public static void main(String[] args) {
        AnimalJ aj = new AnimalJ() {
            @Override
            public void eat() {
                System.out.println("niam niam");
            }
        };
        aj.eat();

    /*    Animal aan = new Animal();
        aan.eat();*/
 /*    Animal animal = new Animal(){
         @Override
         public void eat() {
             System.out.println("last animal is eat");
         }
     };*/
        //animal.eat();
        /*   List<Animal> animalList = new ArrayList<>();
    animalList.add(new Animal(1));
    animalList.add(new Animal(2));
    test(animalList);
    List<Dog> dogList = new ArrayList<>();
    dogList.add(new Dog());
    dogList.add(new Dog());
    test(dogList);*/

    /*ist animals = new ArrayList();
    Animal ourAnimals = new Animal();
    animals.add("Bob");
    animals.add("Cat");
    animals.add("Frog");
    animals.add("Dog");
    animals.add(ourAnimals);
        System.out.println(ourAnimals);
    String s =(String) animals.get(2);
        System.out.println(s);
        System.out.println("--------------------");
        List<String>  animals1 = new ArrayList<>();
        animals1.add("Dog");
        animals1.add("Elephant");
        animals1.add("Bird");
        animals1.add("Mouse");
        System.out.println(animals1.get(2));*/


    }

  /*  public static void testMethod(Animal animal) {
    animal.eat();
    }*/
}

