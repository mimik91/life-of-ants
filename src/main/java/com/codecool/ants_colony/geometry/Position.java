package com.codecool.ants_colony.geometry;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void changeBy(Position direction){
        if (this.x + direction.x >=  0 && this.x + direction.x <9){
            this.x += direction.x;
        }
        if (this.y + direction.y >=  0 && this.y + direction.y <9) {
            this.y += direction.y;
        }
    }

    public void goToEdge(int size){
        int random = (int)(Math.random()*10);
        if (random > 5) {
            yEdge(size);
        } else {
            xEdge(size);
        }
    }

    private void xEdge(int Boardsize) {
        int random = (int) (Math.random() * 10);
        if (random > 5) {
            this.x = Boardsize - 1;
            this.y = (int) Math.random() * (Boardsize - 1);
        } else {
            this.x = 0;
            this.y = (int) Math.random() * (Boardsize - 1);
        }
    }

        private void yEdge(int Boardsize) {
            int random = (int) (Math.random() * 10);
            if (random > 5) {
                this.y = Boardsize - 1;
                this.x = (int) Math.random() * (Boardsize - 1);
            } else {
                this.y = 0;
                this.x = (int) Math.random() * (Boardsize - 1);
            }
    }
}