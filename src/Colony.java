import Ants.Queen;
import Geometry.Board;

public class Colony {
    private final Board board;
    private final Queen queen;


    public Colony(int size){
        board = new Board(size);
        this.queen = new Queen(board.getCenter());
        board.setOn(queen.getSymbol(), queen.getPosition());

    }

    public void printBoard(){
        board.print();
    }




}
