import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File rootDir = new File("documents");
        return searchFileRecursive(rootDir, fileName);
    }
    
    private static String searchFileRecursive(File directory, String fileName) {
        if (!directory.exists() || !directory.isDirectory()) return null;
        
        File[] files = directory.listFiles();
        if (files == null) return null;
        
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                return file.getPath().replace('\\', '/');
            }
            if (file.isDirectory()) {
                String result = searchFileRecursive(file, fileName);
                if (result != null) return result;
            }
        }
        return null;
    }
}