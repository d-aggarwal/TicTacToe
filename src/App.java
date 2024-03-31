
import java.util.*;
import board.Board;
import player.Player;


public class App {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Board b = new Board(4,'&');
        System.out.println("please enter name of player 1");
        String name = sc.next();
        System.out.println("please enter symbol of player 1");
        char symbol = sc.nextLine().charAt(0);
        Player p1 = new Player();
        p1.setPlayerAndSymbol(name,symbol);
        System.out.println("please enter name of player 2");
        String name2 = sc.next();
        System.out.println("please enter symbol of player 2");
        char symbol2 = sc.nextLine().charAt(0);
        Player p2 = new Player();
        p2.setPlayerAndSymbol(name2,symbol2);





    }

}



