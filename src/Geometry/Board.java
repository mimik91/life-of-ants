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

    public Position getCenter(){
        int half = (int)Math.ceil(size/2);
        return new Position(half, half);
    }

    public void setOn(char ant, Position position){
        board[position.y][position.x] = ant;
    }

    public void clear(Position position){
        board[position.y][position.x] = 0;
    }
}
