import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome fellows! Ready to get into Sticks and Luck?");
        System.out.println("Yes or no?");
        ans = sc.nextLine().toUpperCase();
        while (ans.equals("Y")) {
            System.out.println("Let's start then! What is the number or players?");
            int cant = sc.nextInt();
            sc.nextLine();                              //Necesario para limpiar line
            List<Player> players = new ArrayList<>();
            Player aux;                                 //Puedo pasarlo a metodo
            for (int i = 0; i < cant; i++) {
                System.out.print("Enter Player " + (i + 1) + "'s name: \n");
                aux = new Player(sc.nextLine());
                players.add(aux);
            }
            System.out.println(players.size());
            System.out.println("How many sticks?");
            Container cont = new Container(sc.nextInt());
            cont.setSticks(cont.getInitSticks());
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
            System.out.println("Woops! Seems like " + cont.getLast() + " lost this game!");
            System.out.println("Wanna play again?");
            ans = sc.next().toUpperCase();
        }
        System.out.println("Have a nice day! ");
    }
}
