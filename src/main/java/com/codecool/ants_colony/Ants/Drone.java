package com.codecool.ants_colony.Ants;

import com.codecool.ants_colony.geometry.Direction;
import com.codecool.ants_colony.geometry.Position;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Drone extends Ant {
    private List<Direction> directions = Collections.unmodifiableList(Arrays.asList(Direction.values()));
    private Queen destination;
    int mating = 0;

    public Drone(Position position, Queen destination) {
        super('D', position);
        this.destination = destination;
    }


    @Override
    public void move(int size) {
        if (this.getPosition().x > destination.getPosition().x){
            this.getPosition().changeBy(Direction.WEST.getDirction());
        }
        else if (this.getPosition().x < destination.getPosition().x){
            this.getPosition().changeBy(Direction.EAST.getDirction());
        }
        else if (this.getPosition().y > destination.getPosition().y){
            this.getPosition().changeBy(Direction.NORTH.getDirction());
        }
        else if (this.getPosition().y < destination.getPosition().y){
            this.getPosition().changeBy(Direction.SOUTH.getDirction());
        }
        else if (destination.getMood() == true && destination.getMating() == false) {
            System.out.println("HALLELUJAH");
            this.mating += 1;
            destination.setMating();
        }
        else if(this.mating > 0){
            if (mating == 10){
                mating = 0;
                toTheEdge(size);
                destination.finishMating();
            }
            else {
                mating += 1;
            }
        }
        else {
            System.out.println(":'(");
            toTheEdge(size);
        }

    }

    private void toTheEdge(int size){
        this.getPosition().goToEdge(size);
    }
}
