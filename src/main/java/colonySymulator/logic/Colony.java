package colonySymulator.logic;

import colonySymulator.ApplicationSettings;
import colonySymulator.ants.*;
import colonySymulator.geometry.Board;

import java.util.ArrayList;
import java.util.List;

public class Colony {
    private final Board board;
    private final List<Ant> ants = new ArrayList();
    private Queen queen;

    public Colony(ApplicationSettings settings) {
        this.board = new Board(settings.getBoardSize());
        putAntsOnBoard(settings.getWorkersAmount(), settings.getSoldiersAmount(), settings.getDronesAmount());
        board.print();
    }

    public void putAntsOnBoard(int workers, int soldiers, int drones){
        this.queen = new Queen(board.getCenter());
        ants.add(queen);
        for (int i = 0; i < workers; i++) {
            ants.add(new Worker(board.getRandomPosition()));
        }
        for (int i = 0; i < soldiers; i++) {
            ants.add(new Soldier(board.getRandomPosition()));
        }
        for (int i = 0; i < drones; i++) {
            ants.add(new Drone(board.getRandomPosition(), queen));
        }
        for (Ant ant: ants ) {
            board.setOnBoard(ant.getSymbol(), ant.getPosition());
        }
    }

    public void makeMove(){
        for (Ant ant: ants) {
            board.clearField(ant.getPosition());
            ant.move(board.getSize());
        }
        for (Ant ant: ants) {
            board.setOnBoard(ant.getSymbol(), ant.getPosition());
        }
        board.print();

    }
}
