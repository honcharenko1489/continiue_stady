package work_with_files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text99.txt");
      /*  Files.createFile(filePath);
        String dialog = "-Hi\n-normal";
        Files.write(filePath, dialog.getBytes());*/
        List<String> li = Files.readAllLines(filePath);
        for (String s: li ){
            System.out.println(s);
        }
    }
}
