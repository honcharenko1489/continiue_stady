package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File file1 = new File("test88.txt");
        File folder = new File("C:\\Users\\gonch\\Desktop\\A");
        File folder1 = new File("C:\\Users\\gonch\\Desktop\\BOX");
        System.out.println(file.getAbsolutePath() );
        System.out.println(folder.isAbsolute());
        //System.out.println(file1.createNewFile());
       // System.out.println(folder1.mkdir());
       /* System.out.println(file1.length());
        File folder2 =  new File("C:\\Users\\gonch\\Desktop\\9. Работа с файлами IO и NIO");
        System.out.println(folder2.length());*/
        //File file2 = new File("C:\\Users\\gonch\\Desktop\\BOX\\COCO.docx");
        File[] filess = folder1.listFiles();
        System.out.println(Arrays.toString(filess));
        System.out.println(file.canExecute());
    }
}
