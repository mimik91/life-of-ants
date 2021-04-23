import java.util.ArrayList;

public class Colony {
    private final int width;
    private ArrayList<Integer> row = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> board = new ArrayList<>();

    public Colony(int width){
        this.width = width;
        setRow();
        setBoard();


    }

    public  void setRow(){
        for (int i = 0; i < width; i++) {
            row.add(0);
        }
    }

    public void setBoard() {
        for (int i = 0; i < width; i++) {
            board.add(row);
        }
    }

    public void printBoard(){
        for (int i = 0; i < width; i++) {
            System.out.println(board.get(i));
        }
    }
}
