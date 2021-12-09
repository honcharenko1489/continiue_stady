package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\gonch\\Desktop\\M");
        //System.out.println(filePath.toAbsolutePath());
        Path anotherPath = Paths.get("C:\\Users\\gonch\\Desktop\\M\\N\\test777.txt");
       // System.out.println(directoryPath.relativize(anotherPath));
        if (!Files.exists(directoryPath)) {
            Files.createFile(directoryPath);

        }
//        System.out.println(Files.isWritable(filePath));
            Path filePath2 = Paths.get("C:\\Users\\gonch\\Downloads\\" +
                    "springbootdemo\\continiue_stady\\Test2.txt");
        System.out.println(Files.getAttribute(filePath2, "size"));
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry: attributes.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
