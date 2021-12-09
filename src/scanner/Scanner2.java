package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = null;
        Set<String> strSet = new TreeSet<>();
        try {
            sc = new Scanner(new FileReader(new File("C:\\Users\\gonch\\Desktop\\my.txt")));
            sc.useDelimiter("\\W");
            while (sc.hasNext()){
                String word = sc.next();
                strSet.add(word);
            }
                for (String word:strSet){
                    System.out.println(word);
                }
        } catch (FileNotFoundException e) {
            System.out.println("we have a problem");
        }
        finally {
            sc.close();
        }
    }
}
