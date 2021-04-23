package Ants;

import Geometry.Position;

public abstract class Ant {
    Position position;
    private final char symbol;

    public Ant(char symbol){
        this.symbol = symbol;
    }

    public abstract void changePosition();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public char symbol(){
        return this.symbol;
    }
}
