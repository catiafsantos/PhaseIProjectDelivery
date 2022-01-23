import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class fileHandling {

    static void createFile(String filename) throws IOException {
        // Create new file
        File file = new File("DIRECTORY/$filename.txt");

        try{
            file.createNewFile();
            System.out.println("The file: "+ filename +" was created with success.");
        } catch (FileAlreadyExistsException e) {
            System.out.println("The mentioned file: "+ filename +" already exists in this directory, and will therefore, not be created.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write info on the created file
        FileWriter writer = new FileWriter(file);
        writer.write("Hello, this is me writing on the file using the createFile Method!");
        writer.close();
    }

    // Method to delete file per filename
    static void deleteFile(String filename) throws IOException {
        try {
            Files.delete(Paths.get("DIRECTORY/$filename.txt"));
        }  catch (NoSuchFileException e) {
            System.out.println("The mentioned file was not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The mentioned file: "+ filename +" was deleted successfully.");
    }

    // Method to read file per filename
    static void readFile(String filename) throws IOException {
        try {
            System.out.println(Files.readAllLines(Paths.get("DIRECTORY/$filename.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to order files per ASC order
    static void orderFiles() throws IOException{
        System.out.println("You've reached the orderFiles() method.This is not implemented yet.");
    }
}
