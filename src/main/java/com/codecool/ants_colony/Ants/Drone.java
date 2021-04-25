package com.codecool.ants_colony.Ants;

import com.codecool.ants_colony.geometry.Direction;
import com.codecool.ants_colony.geometry.Position;

public class Drone extends Ant {
    public Drone(Position position) {
        super('D', position);
    }


    @Override
    public void move(int size) {
        Direction myDirection = directions.get(moves % 4);
        this.getPosition().changeBy(myDirection.getDirction());
        moves += 1;
    }
}
