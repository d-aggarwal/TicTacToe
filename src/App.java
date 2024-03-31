
import java.util.*;
import board.Board;
import player.Player;
import game.Game;


public class App {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Board b = new Board(3,'&');
        System.out.println("please enter name of player 1");
        String name = sc.next();
        System.out.println("please enter symbol of player 1");
        char symbol = sc.next().charAt(0);
        Player p1 = new Player();
        p1.setPlayerAndSymbol(name,symbol);
        System.out.println("please enter name of player 2");
        String name2 = sc.next();
        System.out.println("please enter symbol of player 2");
        char symbol2 = sc.next().charAt(0);
        Player p2 = new Player();
        p2.setPlayerAndSymbol(name2,symbol2);

        Game game = new Game(new Player[]{p1,p2},b);
        game.play();



    }

}



