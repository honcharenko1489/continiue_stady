package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAnaFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test5.txt");
        Path directoryPath = Paths.get("C:\\Users\\gonch\\Desktop\\A");
        Path directoryBPath = Paths.get("C:\\Users\\gonch\\Desktop\\B");
//       Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
      //  Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        Files.copy(directoryBPath, directoryPath.resolve("B"));
//        Files.move(filePath, directoryPath.resolve("test15"));
//            Files.move(Paths.get("test10.txt"), (Paths.get("tex11.txt")) );
            Files.delete(Paths.get("test88.txt"));
        System.out.println("Done!");
    }
}
