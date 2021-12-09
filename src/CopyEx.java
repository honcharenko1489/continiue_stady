import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new
                FileReader("Test2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Text3.txt"));
        ) {
            int  character;
            while ((character=reader.read())!=-1){
                writer.write(character);
            }
          /*  String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);


            }*/
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

    }
}}
