import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private transient List<Post> postList = new ArrayList<>(10);
    private transient List<Tag> tagList = new ArrayList<>(20);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayWelcome();
        int ans = displayGralOptions(sc);
        while (ans != 3) {                  // Just for the Loop
            optionGralSwitcher(ans,sc);
        }
        System.out.println("Goodbye!");
    } // End Main

    public static void displayWelcome(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bienvenido a la PostApplication1000 Deluxe Console Edition");
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
    }

    public static int optionGralSwitcher(int ans, Scanner sc) {
        switch (ans) {
            case 1:
                postManagement(sc);
            case 2:
                tagsManagement(sc);
            default:
                return 3;
        }
    }

    public static Integer displayGralOptions(Scanner sc) {
        System.out.println("Options: --------------------------------------------------");
        System.out.println("1.Posts" + "\n" + "2.Tags" + "\n" + "3.Write 'q' to exit");
        String x = sc.nextLine();
        try {
            if (x.toUpperCase().equals("Q")) {
                return 3;
            }
            return Integer.parseInt(x);
        } catch (NumberFormatException e) {
            System.out.println("Error. You haven't introduced a correct option");
            return (0);
        }

    }

    public static void postManagement(Scanner sc){
        int ans = displayPostOptions(sc);
        switch (ans) {
            case 1:
                System.out.print("Creating new Post!");
                createPost();
            case 2:
                System.out.print("2");
            default:
                return 3;
        }
    }
    private static Integer displayPostOptions(Scanner sc){
        System.out.println("Options: --------------------------------------------------");
        System.out.println("1.New Post" + "\n" + "2.Edit Post" + "\n" + "3.Delete a post" + "4. Write 'q' to exit");
        String x = sc.nextLine();
        try {
            if (x.toUpperCase().equals("Q")) {
                return 4;
            }
            return Integer.parseInt(x);
        } catch (NumberFormatException e) {
            System.out.println("Error. You haven't introduced a correct option");
            return (0);
        }

    }
    private static void displayTagsOptions(Scanner sc) {
    }
    public static void tagsManagement(){

    }
}

