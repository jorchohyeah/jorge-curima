import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class App {

    public static transient List<Post> postList = new ArrayList<>(10);
    public static transient List<Tag> tagList = new ArrayList<>(20);
    public static int opt, opt2;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        displayWelcomeGreeting();
        gralOptionsManagement(sc);
        while (opt != 3) {                                  //Main Loop
            optionsSwitcher(opt, sc);
            gralOptionsManagement(sc);
        }
        System.out.println("Goodbye!");
    } // End Main

    public static void displayWelcomeGreeting() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Welcome to PostApplication1000 Deluxe Console Edition");
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
    } //General Displayer

    // POSTS LOGIC
    public static void gralOptionsManagement(Scanner sc) {                      //Displays the General Options
        System.out.println(" Select your Option Number: ----------------------------------");
        System.out.println("1.Posts" + "\n" + "2.Tags" + "\n" + "3.Exit");
        try {
            opt = sc.nextInt();                                                 //opt loaded
        } catch (InputMismatchException e) {
            System.out.println("You haven't provided a number. Please restart the App");
            opt = 3;
        }
        if ((opt < 1) || (opt > 3)) {
            System.out.println("The number you've provided is invalid. Please restart the App");
            opt = 3;
        }
    }

    public static int optionsSwitcher(int opt1, Scanner sc) {             //This is the inner switcher inside loop
        switch (opt1) {
            case 1:
                postManagement(sc);
/*          case 2:
                tagsManagement(sc);
            case 3:
                viewAllPosts();
                // Necesitaria un showPost iterado por todos los posts
            case 4:
                view10MostRecentEntries();*/
            default:
                return 5;
        }
    }


    public static int postManagement(Scanner sc) {
        int aux = selectPostOptions(sc);
        switch (aux) {
            case 1:
                System.out.println("Creating new Post!");
                createPost(sc);
                return 1;
            /*case 2:
                System.out.println("Editing Post");
                editPost();
                return 2;
            case 3:
                System.out.println("Deleting a Post");
                deletePost();
                return 3;
            case 4:
                System.out.println("Please insert the Id number of the post")
                return 4;*/
        }
        return 5;
    }

    private static Integer selectPostOptions(Scanner sc) {
        int aux2;
        System.out.println("Post Options: ----------------------------------------");
        System.out.println("1.New Post" + "\n" + "2.Edit Post" + "\n" + "3.Delete a post" + "\n" + "4.Show post" + "\n" + "5.Exit");
        try {
            aux2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You haven't provided a number. Please restart the App");
            opt = 1;
            aux2 = 5;
        }
        if ((opt2 < 1) || (opt2 > 3)) {
            System.out.println("The number you've provided is invalid. Please restart the App");
            opt = 1;
            aux2 = 5;
        }
        return aux2;
    }

    private static void createPost(Scanner sc) {
        Post posti = new Post();
        if (postList.isEmpty()) {       //Check if first
            posti.setId(1);
        } else {
            int i = 0;
            while (i < postList.size()) {       //Otherwise look for last entry
                if (postList.get(i) == null) {
                    posti.setId(i + 1);
                }
            }
        }
        System.out.println("Insert the title");
        posti.setTitle(sc.nextLine());
        System.out.println("What do you want to post?");
        posti.setTitle(sc.nextLine());
        // Check for repeated tags, tenes tagList (Transient) y tags (Post)
        boolean flag = true;
        while (flag) {
            System.out.println("Add a tag. (All posts must have at least 1)");
            createTag();
            sc.nextLine();
            if
        }
        System.out.println("1.Add a custom date (yyyy-MM-ddThh:mm:ss) or 2.Get automatically");
        int aux = sc.nextInt();
        if (!(aux == 1) || !(aux == 2)) {
            System.out.println("The number you've provided is invalid.");
            opt = 3;
        } else {
            if (aux == 1) {
                posti.setDate(LocalDateTime.parse(sc.nextLine()));
            } else {
                posti.setDate(LocalDateTime.now());
            }
        }

        System.out.println("Your post have been successfully created on " + posti.getDate());
    }


    // TAGS LOGIC

    private static Integer selectTagsOptions(Scanner sc) {

    }

    public static int tagsManagement(Scanner sc) {
        int aux = selectTagsOptions(sc);
        switch (aux) {
            case 1:
                System.out.println("Creating new Tag!");
                createTag(sc);
                return 1;
            /*case 2:
                System.out.println("Editing Tag");
                editPost();
            case 3:
                System.out.println("Deleting a Tag"); //Must be in cascade because all post with this Tag should be deleted
                deleteTag();
            case 4:
                System.out.println("Please insert the Id number of the Tag")*/
        }
        return 5;
    }

    private static void createTag(Scanner sc) {

    }

}

