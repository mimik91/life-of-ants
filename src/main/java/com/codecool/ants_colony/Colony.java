package com.codecool.ants_colony;

import com.codecool.ants_colony.geometry.Board;

import java.util.ArrayList;

public class Colony {
    private final Board board;

    public Colony(int size){
        this.board = new Board(size);
    }
}
