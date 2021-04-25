package com.codecool.ants_colony.geometry;

public class Board {
    private final int size;
    private final char[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
    }
}
