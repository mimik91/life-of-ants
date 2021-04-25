package com.codecool.ants_colony.Ants;

import com.codecool.ants_colony.geometry.Position;

public abstract class Ant {
    private Position position;
    private final char symbol;

    protected Ant(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol(){
        return this.symbol;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
