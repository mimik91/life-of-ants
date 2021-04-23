import Geometry.Board;

import java.util.ArrayList;

public class Colony {
    private final Board board;


    public Colony(int size){
        this.board = new Board(size);
    }

    public void printBoard(){
        board.print();
    }




}
