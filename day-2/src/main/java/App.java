import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static transient List<Post> postList = new ArrayList<>(10);
    public static transient List<Tag> tagList = new ArrayList<>(20);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayWelcome();
        int ans = displayGralOptions(sc);
        while (ans != 3) {                  // Just for the Loop
            optionGralSwitcher(ans, sc);
        }
        System.out.println("Goodbye!");
    } // End Main

    public static void displayWelcome() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Bienvenido a la PostApplication1000 Deluxe Console Edition");
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
    } //General Displayer

    public static int optionGralSwitcher(int ans, Scanner sc) {
        switch (ans) {
            case 1:
                postManagement(sc);
            case 2:
                tagsManagement(sc);
            case 3:
                viewAllPosts();
                // Necesitaria un showPost
            case 4:
                view10MostRecentEntries();
            default:
                return 3;
        }
    }  //General switcher

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

    } //General Options

    public static int postManagement(Scanner sc) {
        int ans = displayPostOptions(sc);
        switch (ans) {
            case 1:
                System.out.println("Creating new Post!");
                App.createPost();
            case 2:
                System.out.println("Editing Post");
                editPost();
            case 3:
                System.out.println("Deleting a Post");
                deletePost();
            case 4:
                System.out.println("Please insert the Id number of the post")
            default:
                return 4;
        }
    }

    private static Integer displayPostOptions(Scanner sc) {
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

    } //Post options

    private static createPost() {
        Post posti = new Post();
        if (postList.isEmpty()) {
            posti.setId(1);
        } else {
            int i = 0;
            while (i < postList.size()) {
                if (postList.get(i) == null) {
                    posti.setId(i + 1);
                }
            }
        }
        System.out.println("Insert the title");
        System.out.println("What do you want to post?");
        System.out.println("Add your tags");
        System.out.println("Your post have been successfully created on" + posti.getDate());

        sc.
                System.out.println("")
    }


    private static void displayTagsOptions(Scanner sc) {
    }

    public static void tagsManagement() {

    }
}

