import Ants.Ant;
import Ants.Drone;
import Ants.Queen;
import Ants.Worker;
import Geometry.Board;

public class Colony {
    private final Board board;
    private final Queen queen;


    public Colony(int size){
        board = new Board(size);
        this.queen = new Queen(board);
        generateAnts(5,5,5);
    }

    public void printBoard(){
        board.print();
    }

    public void generateAnts(int workers, int drones, int soldiers){
        for (int i = 0; i < workers; i++) {
            board.placeOn(new Worker());
        }
        for (int i = 0; i < drones; i++) {
            board.placeOn(new Drone());
        }
        for (int i = 0; i < soldiers; i++) {
            board.placeOn(new Worker());
        }
    }




}
