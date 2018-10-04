import java.security.InvalidParameterException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome fellows! Ready to get into Sticks and Luck?");
        System.out.println("Yes = Y or No = N?");
        String ans = sc.nextLine().toUpperCase();
        if (ans.equals("Y") || ans.equals("N")) {
            while (ans.equals("Y")) {
                System.out.println("Let's start then! What is the number or players?");
                List<Player> players = createPlayers(sc.nextInt(), sc);
                if (!(players.isEmpty())) {
                    System.out.println("How many sticks?");
                    Container cont = initializeContainer(sc.nextInt(), sc);
                    if (cont.getInitSticks() > 0) {
                        System.out.println("Woops! Seems like: " + chooseLoser(players, cont, sc) + " has lost this match! Better luck next time!");
                        System.out.println("Wanna play again? Yes = Y or No = N");
                        ans = sc.next().toUpperCase();
                    } else {
                        System.out.println("You've entered an invalid number of sticks. Please restart the App to play again.");
                        break;
                    }
                } else {
                    System.out.println("You've entered an invalid number of players. Please restart the App to play again.");
                    break;
                }
            }
        }else{
            System.out.println("You've entered an invalid option. Please restart the App to play again.");
        }
        System.out.println("Have a nice day! ");
    }

    private static List<Player> createPlayers(int cant, Scanner sc) {
        sc.nextLine();
        if (cant < 1) {                 //If the number provided is invalid
            return new ArrayList<>();
        }
        List<Player> players = new ArrayList<>();
        Player aux;
        for (int i = 0; i < cant; i++) {
            System.out.print("Enter Player " + (i + 1) + "'s name: \n");
            aux = new Player(sc.nextLine());
            players.add(aux);
        }
        return players;
    }

    private static Container initializeContainer(int sticks, Scanner sc) {
        Container cont = new Container(sticks);
        cont.setSticks(cont.getInitSticks());
        return cont;
    }

    private static String chooseLoser(List<Player> players, Container cont, Scanner sc) {
        int x = 0;
        int sticks = 0;
        while (cont.getSticks() > 0) {
            if (x > players.size() - 1) {
                x = 0;
            }
            cont.setLast(players.get(x).getName());
            System.out.println("Now is the turn of: " + players.get(x).getName());
            System.out.println("Take 1 or 2?");
            sticks = sc.nextInt();
            while ((sticks != 1) && (sticks != 2)) {
                System.out.println("Hey don't try to cheat! Just pick 1 or 2");
                sticks = sc.nextInt();
            }
            cont.takeStick(sticks);
            x++;
        }
        return cont.getLast();
    }
}