package work_with_files.proggrammer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", "Red");
     /*   Employees e1 = new Employees("maria", "Kislyakova ", "it",
                //28,
                5000, car);*/
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){

          //  outputStream.writeObject(e1);
            System.out.println("Done!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
