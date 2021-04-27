package colonySymulator;

public class ApplicationSettings {
    private final int boardSize = 9;
    private final int workersAmount = 5;
    private final int soldiersAmount = 5;
    private final int dronesAmount = 3;

    public int getBoardSize() {
        return boardSize;
    }

    public int getWorkersAmount() {
        return workersAmount;
    }

    public int getSoldiersAmount() {
        return soldiersAmount;
    }

    public int getDronesAmount() {
        return dronesAmount;
    }
}
