package game;
import player.Player;
import board.Board;
import java.util.*;
public class Game {
    Player [] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;
    Scanner sc = new Scanner(System.in);

    public Game(Player[] players, Board board) {
        this.players = players;
        this.board = board;
        this.turn = 0;
        this.noOfMoves = 0;
        this.gameOver = false;

        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();


        for (int i=0;i<board.size;i++) {
            z.append('0');
            c.append('X');
        }

        this.zero = z.toString();
        this.cross= c.toString();

    }

    public void play() {
        board.printboardconfig();
    }

    public int getIndex() {


        while(true) {
            System.out.println("Player"+ players[turn].getPlayerName() + "give me position remaining from 1 to" +board.size*board.size);
            int pos = sc.nextInt()-1;

            int row = pos/ board.size;
            int col = pos % board.size;

            if (board.matrix[row][col] != players[turn].symbol) {
                System.out.println("already occupied");
                continue;
            }

            return pos;

        }
    }
}
