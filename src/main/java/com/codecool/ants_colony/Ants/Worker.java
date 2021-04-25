package com.codecool.ants_colony.Ants;


import com.codecool.ants_colony.geometry.Board;
import com.codecool.ants_colony.geometry.Direction;
import com.codecool.ants_colony.geometry.Position;
import com.codecool.ants_colony.geometry.RandomDirection;

public class Worker extends Ant {

    public Worker(Position position) {
        super('W', position);
    }

    @Override
    public void move(int size) {
        RandomDirection randomDirection = new RandomDirection();
        Direction myDirection = randomDirection.get();
        this.getPosition().changeBy(myDirection.getDirction());
    }
}
