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

}