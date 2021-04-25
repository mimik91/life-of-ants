package com.codecool.ants_colony.Ants;

import com.codecool.ants_colony.geometry.Position;

import java.io.PipedOutputStream;

public class Queen extends Ant {

    public Queen(Position position) {
        super('Q', position);
    }

    @Override
    public void move(int size) {

    }
}
