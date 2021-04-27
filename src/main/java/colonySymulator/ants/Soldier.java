package colonySymulator.ants;


import colonySymulator.geometry.Coordynates;
import colonySymulator.geometry.Direction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soldier extends Ant{
    private final List<Direction> directions = Collections.unmodifiableList(Arrays.asList(Direction.values()));
    private int moves = 0;



    public Soldier(Coordynates coordynates) {
        super('S', coordynates);

    }

    @Override
    public void move(int size) {
        Direction myDirection = directions.get(moves % 4);
        this.getPosition().changeBy(myDirection.getDirection());
        moves += 1;
    }
}
