import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class fileHandling {

    static void createFile(String fileName) throws IOException {
        // Create new file
        String path = "FileDirectory/" + fileName;
        System.out.println(path);
        File file = new File(path);

        try { if (!file.exists()){
            file.createNewFile();
            System.out.println("The file: "+ fileName +" was created with success.");
        } else {
            System.out.println("The mentioned file: "+ fileName +" already exists in this directory, and will therefore, not be created.");
        } } catch (IOException e) {
            e.printStackTrace();
        }

        // Write info on the created file
        FileWriter writer = new FileWriter(file);
        writer.write("Hello, this is me writing on the file: "+ fileName +"  using the createFile() method!");
        writer.close();
    }

    // Method to delete file per fileName
    static void deleteFile(String fileName) {
        String path = "FileDirectory/" + fileName;

        try {
            Files.delete(Paths.get(path));
            System.out.println("The mentioned file: "+ fileName +" was deleted successfully.");
        }  catch (NoSuchFileException e) {
            System.out.println("The mentioned file was not found. The application will exit now.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read file per fileName
    static void readFile(String fileName) {
        String path = "FileDirectory/" + fileName;
        try {
            System.out.println(Files.readAllLines(Paths.get(path)));
        }  catch (NoSuchFileException e) {
            System.out.println("The mentioned file was not found. The application will exit now.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to order files per ASC order
    static void orderFiles() {
        System.out.println("You've reached the orderFiles() method.This is not implemented yet.");
    }
}
