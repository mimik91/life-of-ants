package com.codecool.ants_colony.geometry;


public enum Direction {
    NORTH(new Position(0, -1)),
    EAST(new Position(1, 0)),
    SOUTH(new Position(0, 1)),
    WEST(new Position(-1, 0));

    public final Position dirction;

    private Direction(Position dirction) {
        this.dirction = dirction;
    }

    public Position getDirction() {
        return this.dirction;
    }

}
