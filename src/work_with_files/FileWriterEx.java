package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "A lot of years I think about life in earth.\n"+
                    "haven`t under moon for me.\n"+
                "i know that I anything don`t know!\n"+
                "that latest true? what i opened.";
        String s = "Hii";

        try (FileWriter writer = new FileWriter("Test2.txt", true)){

            /*for (int i=0; i<rubai.length(); i++){
                writer.write(rubai.charAt(i));
            }*/
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
