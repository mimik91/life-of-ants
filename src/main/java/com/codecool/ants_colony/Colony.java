package com.codecool.ants_colony;

import com.codecool.ants_colony.Ants.Queen;
import com.codecool.ants_colony.geometry.Board;
import com.codecool.ants_colony.logic.AntManager;

import java.util.ArrayList;
import java.util.Queue;

public class Colony {
    private final Board board;
    private final Queen queen;
    private final AntManager antManager;

    public Colony(int size){
        this.board = new Board(size);
        this.queen = new Queen(board.getCenter());
        board.setOnBoard(queen.getSymbol(), queen.getPosition());
        this.antManager = new AntManager(board, 5,5,5);
        board.print();
    }

    public void makeMove(){
        antManager.moveAnts();
        board.print();
    }

    public void printBoard(){
        board.print();
    }
}
