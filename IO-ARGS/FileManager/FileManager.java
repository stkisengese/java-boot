import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }
    public static String getContentFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public static void deleteFile(String fileName) {
        //  File file = new File(fileName);
        // if (file.exists()) {
        //     file.delete();
        // }
        
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            // e.printStackTrace();
        }
        // 
    }
}