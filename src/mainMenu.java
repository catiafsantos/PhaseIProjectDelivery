import java.io.IOException;
import java.util.Scanner;

public class mainMenu {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String firstUserInput;

        System.out.println("Welcome to the FileHandling App.\nDeveloped by Cátia Santos<catia.santos3@vodafone.com> as a SimpleLearn Java FullStack Dev course assignment.\nPlease choose one of the following options:\nOption 1) - Scan the App Directory and Sort Files by ASC order\nOption 2) - Select for more file handling options(Create,Search,Delete).\nOption 3) - Exit the Application.");

        firstUserInput = sc.next();

        switch (firstUserInput.toLowerCase()){
            case "1":
                System.out.println("Option 1 was chosen.");;
                fileHandling.orderFiles();
                break;
            case "2":
                System.out.println("Option 2 was chosen.");;
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
    static void extraMenuOptions() throws IOException{
        System.out.println("You've reached the extraMenuOptions.");



    }
}
