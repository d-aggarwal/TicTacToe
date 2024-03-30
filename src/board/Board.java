package board;

public class Board {
    int size;
    char [][] matrix;

    public  Board(int size,char symbol) {
        this.size =size;
        matrix = new char[size][size];

        for (int i =0; i<size; i++) {
            for (int j=0; j<size; j++) {
                matrix[i][j] = symbol;
            }
        }

    }


    public void printboardconfig() {

        int sz = this.size;
        for (int i =0; i<size; i++) {
            for (int j=0; j<size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}