package colonySymulator.geometry;

public class Board {
    private final int size;
    private final char[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
    }

    public Coordynates getCenter(){
        int center = (int) Math.floor(this.size/2);
        return new Coordynates(center, center);
    }

    public void setOnBoard(char ant, Coordynates coordynates){
        board[coordynates.y][coordynates.x] = ant;
    }

    public void clearField(Coordynates coordynates){
        setOnBoard('\u0000', coordynates);
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(board[i]);
        }
    }

    public Coordynates getRandomPosition(){
        return new Coordynates(randomCoordinate(), randomCoordinate());
    }

    private int randomCoordinate(){
        return (int)(Math.random() * (size-1));
    }

    public int getSize() {
        return size;
    }
}
