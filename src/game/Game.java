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

        int size = board.size;
        while (!gameOver) {
            board.printboardconfig();
            noOfMoves ++;
            int idx = getIndex();
            int row = idx/size;
            int col = idx%size;
            board.matrix[row][col] = players[turn].symbol;

            if(noOfMoves >=2*size-1 && checkCombinations()){
                gameOver = true;
                board.printboardconfig();
                System.out.println("winner is "+ players[turn].getPlayerName());
                return;
            }

            if(noOfMoves >=size*size) {
                gameOver = true;
                board.printboardconfig();
                System.out.println("Game Over ");
                return;
            }

            board.matrix[row][col] = players[turn].symbol;

            turn = (turn +1)%2;
        }
    }

    public int getIndex() {


        while(true) {
            System.out.println("Player "+ players[turn].getPlayerName() + " give me position remaining from 1 to " +board.size*board.size);
            int pos = sc.nextInt()-1;

            int row = pos/ board.size;
            int col = pos % board.size;

            if (board.matrix[row][col] != '&') {
                System.out.println("already occupied");
                continue;
            }

            return pos;

        }
    }

    public boolean checkCombinations() {
        int size = board.size;

        for (int i =0;i<size; i++) {
            StringBuilder s = new StringBuilder();
            for(int j =0;j<size;j++) {
                s.append(board.matrix[i][j]);
            }

            if(s.toString().equals(zero) || s.toString().equals(cross)) {
                return true;
            }
        }

        for (int i =0;i<size; i++) {
            StringBuilder s = new StringBuilder();
            for(int j =0;j<size;j++) {
                s.append(board.matrix[j][i]);
            }

            if(s.toString().equals(zero) || s.toString().equals(cross)) {
                return true;
            }
        }

        StringBuilder s = new StringBuilder();
        for(int i =0,j=0;i<size && j<size;i++,j++) {


                s.append(board.matrix[j][i]);

            if(s.toString().equals(zero) || s.toString().equals(cross)) {
                return true;
            }
        }

         s = new StringBuilder();
        for(int i =0,j=size-1;i<size && j>=0;i++,j--) {


            s.append(board.matrix[j][i]);

            if(s.toString().equals(zero) || s.toString().equals(cross)) {
                return true;
            }
        }

              return false;
    }
}
