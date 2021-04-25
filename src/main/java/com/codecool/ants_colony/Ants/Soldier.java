package com.codecool.ants_colony.Ants;


import com.codecool.ants_colony.geometry.Direction;
import com.codecool.ants_colony.geometry.Position;
import com.codecool.ants_colony.geometry.RandomDirection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soldier extends Ant{
    private final List<Direction> directions = Collections.unmodifiableList(Arrays.asList(Direction.values()));
    private int moves = 0;


    public Soldier(Position position) {
        super('S', position);

    }

    @Override
    public void move(int size) {
        Direction myDirection = directions.get(moves % 4);
        this.getPosition().changeBy(myDirection.getDirction());
        moves += 1;
    }
}
