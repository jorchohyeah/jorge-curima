package main.java.resis.java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args ){

        String ans = "";
        Scanner sc = new Scanner(System.in);
        System.out.println( "Wellcome fellows! Ready to get into Sticks and Luck?");
        System.out.println("Yes or no?");
        if (sc.nextLine().toUpperCase() == "Y"){
            System.out.println("Let's start then! What is the number or players?");
            int cant = sc.nextInt();
            List<Player> players = new ArrayList<>();
            Player aux;
            for (int i = 0; i < cant ; i++) {
                System.out.println("Ingrese el nombre del Player" + i);
                aux = new Player(sc.nextLine());
                players.add(aux);
            }
            System.out.println("How many sticks?");
            Container cont = new Container(sc.nextInt());
            int x = 0;
            cont.setSticks(cont.getInitSticks());
            while (cont.getSticks() > 0){
                if (x < players.size()){
                    System.out.println("Ahora es turno de " + players.get(x).getName());
                    System.out.println("Take 1 or 2?");
                    cont.takeStick(sc.nextInt());
                }else{
                    x = 0;
                }
            }
            System.out.println("Woops! Seems like " + players.get(x).getName() + " lost this game!");
        }
    }
}
