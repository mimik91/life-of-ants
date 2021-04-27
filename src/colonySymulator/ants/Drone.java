package colonySymulator.ants;

import colonySymulator.geometry.Coordynates;
import colonySymulator.geometry.Direction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Drone extends Ant {
    private final List<Direction> directions = Collections.unmodifiableList(Arrays.asList(Direction.values()));
    private final Queen destination;
    int mating = 0;

    public Drone(Coordynates position, Queen destination) {
        super('D', position);
        this.destination = destination;
    }


    @Override
    public void move(int size) {
        if (this.getPosition().x > destination.getPosition().x){
            this.getPosition().changeBy(Direction.WEST.getDirection());
        }
        else if (this.getPosition().x < destination.getPosition().x){
            this.getPosition().changeBy(Direction.EAST.getDirection());
        }
        else if (this.getPosition().y > destination.getPosition().y){
            this.getPosition().changeBy(Direction.NORTH.getDirection());
        }
        else if (this.getPosition().y < destination.getPosition().y){
            this.getPosition().changeBy(Direction.SOUTH.getDirection());
        }
        else if (destination.getMood() && !destination.getMating()) {
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
        this.getPosition().pushToEdge(size);
    }
}
