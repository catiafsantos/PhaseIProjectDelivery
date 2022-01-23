import java.io.IOException;
import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the FileHandling App.\nDeveloped by Cátia Santos<catia.santos3@vodafone.com> as a SimpleLearn Java FullStack Dev course assignment.\nPlease choose one of the following options:\nOption 1) - Scan the App Directory and Sort Files by ASC order\nOption 2) - Select for more file handling options(Create,Search,Delete).\nOption 3) - Exit the Application.");

        String firstUserInput = sc.next();

        switch (firstUserInput.toLowerCase()){
            case "1":
                System.out.println("Option 1 was chosen.");;
                fileHandling.orderFiles();
                break;
            case "2":
                System.out.println("Option 2 was chosen. Extra Options to file handling will be presented.Please choose one of the following options:");;
                extraMenuOptions();
                break;
            case "3":
                System.out.println("Option 3 was chosen. The app is going to close.\nThank you for using it!");;
                break;
            default:
                System.out.println("That is not a valid option. The application will exit now.");
        System.exit(0);
        }
    }
    static String extraMenuOptions() throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Option 1) - Create a new file.\nOption 2) - Delete a particular file.\nOption 3) - Search for a particular file.\nOption 4) - Go back to the previous Menu.");

        String secondUserInput = sc.next();
        
        String fileName = null;

        switch (secondUserInput.toLowerCase()){
            case "1":
                System.out.println("Option 1 was chosen, a new file will be created. Please enter the fileName: ");;
                fileName = sc.next() + ".txt";
                fileHandling.createFile(fileName.toLowerCase());
                break;
            case "2":
                System.out.println("Option 2 was chosen, the chosen file will be deleted. Please enter the fileName: ");;
                fileName = sc.next() + ".txt";
                fileHandling.deleteFile(fileName);
                break;
            case "3":
                System.out.println("Option 3 was chosen, the chosen file will be read. Please enter the fileName: ");;
                fileName = sc.next() + ".txt";
                fileHandling.readFile(fileName);
                break;
            case "4":
                System.out.println("Option 3 was chosen. You will be sent back into the previous Menu.");;
                new mainMenu();
                break;    
            default:
                System.out.println("That is not a valid option. The application will exit now.");
                System.exit(0);
        }
        return fileName;
    }
}
