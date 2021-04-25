package com.codecool.ants_colony.geometry;

public class Board {
    private final int size;
    private final char[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
    }

    public Position getCenter(){
        int center = (int) Math.floor(this.size/2);
        return new Position(center, center);
    }

    public void setOnBoard(char ant, Position position){
        board[position.y][position.x] = ant;
    }

    public void clearField(Position position){
        board[position.y][position.x] = 0;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(board[i]);
        }
    }

    public Position getRandomPosition(){
        int randomX = (int)(Math.random() * (size-1));
        int randomY = (int)(Math.random() * (size-1));
        return new Position(randomX, randomY);
    }

    public int getSize() {
        return size;
    }
}
