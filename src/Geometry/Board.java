package Geometry;

public class Board {
    private final char[][] board;
    private final int size;


    public Board(int size){
        this.board = new char[size][size];
        this.size = size;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(board[i]);
        }
    }
}
