import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome fellows! Ready to get into Sticks and Luck?");
        System.out.println("Yes or no?");
        String ans;
        ans = sc.nextLine().toUpperCase();
        while (ans.equals("Y")) {
            System.out.println("Let's start then! What is the number or players?");                 //Necesario para limpiar line
            List<Player> players = createPlayers(sc.nextInt(),sc);
            System.out.println("How many sticks?");
            Container cont = initializeContainer(sc.nextInt(),sc);
            System.out.println("Woops! Seems like :" + chooseLoser(players,cont,sc) + " has lost this match! Better luck next time!");
            System.out.println("Wanna play again?");
            ans = sc.next().toUpperCase();
        }
        System.out.println("Have a nice day! ");
    }
    private static List<Player> createPlayers(int cant,Scanner sc){
        sc.nextLine();
        List<Player> players = new ArrayList<>();
        Player aux;
        for (int i = 0; i < cant; i++) {
            System.out.print("Enter Player " + (i + 1) + "'s name: \n");
            aux = new Player(sc.nextLine());
            players.add(aux);
        }
        return players;
    }
    private static Container initializeContainer(int sticks,Scanner sc){
        Container cont = new Container(sticks);
        cont.setSticks(cont.getInitSticks());
        return cont;
    }
    private static String chooseLoser(List<Player> players,Container cont,Scanner sc){
        int x = 0;
        int sticks = 0;
        while (cont.getSticks() > 0) {
            if (x > players.size()-1){
                x = 0;
            }
            cont.setLast(players.get(x).getName());
            System.out.println("Now is the turn of: " + players.get(x).getName());
            System.out.println("Take 1 or 2?");
            sticks = sc.nextInt();
            while ((sticks != 1) && (sticks != 2)){
                System.out.println("Hey don't try to cheat! Just pick 1 or 2");
                sticks = sc.nextInt();
            }
            cont.takeStick(sticks);
            x++;
        }
        return cont.getLast();
    }
}