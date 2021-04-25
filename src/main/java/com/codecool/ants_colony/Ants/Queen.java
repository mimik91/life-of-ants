package com.codecool.ants_colony.Ants;

import com.codecool.ants_colony.geometry.Position;

import java.io.PipedOutputStream;

public class Queen extends Ant {
    private boolean mood = true;
    private boolean mating = false;

    public Queen(Position position) {
        super('Q', position);
    }

    @Override
    public void move(int size) {

    }

    public void setMating(){
        this.mating = true;
    }

    public void finishMating(){
        this.mating = false;
    }

    public boolean getMood(){
        return this.mood;
    }

    public boolean getMating(){
        return this.mating;
    }
}
