package com.codecool.ants_colony.logic;

import com.codecool.ants_colony.Ants.*;
import com.codecool.ants_colony.geometry.Board;
import com.codecool.ants_colony.geometry.Directions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AntManager {
    private final Board board;
    private final List<Ant> ants = new ArrayList();
    private final Directions directions;
    private Queen queen;

    public AntManager(Board board, int workers, int soldiers, int drones) {
        this.board = board;
        this.directions = new Directions();
        setAnts(workers, soldiers, drones);
    }

    public void setAnts(int workers, int soldiers, int drones){
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

    public void moveAnts(){
        for (Ant ant: ants) {
            board.clearField(ant.getPosition());
            ant.move(board.getSize());
        }
        for (Ant ant: ants) {
            board.setOnBoard(ant.getSymbol(), ant.getPosition());
        }

    }
}
