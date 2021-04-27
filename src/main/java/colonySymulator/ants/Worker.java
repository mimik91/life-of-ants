package colonySymulator.ants;


import colonySymulator.geometry.Coordynates;
import colonySymulator.geometry.Direction;
import colonySymulator.geometry.RandomDirection;

public class Worker extends Ant {

    public Worker(Coordynates position) {
        super('W', position);
    }

    @Override
    public void move(int size) {
        RandomDirection randomDirection = new RandomDirection();
        Direction myDirection = randomDirection.get();
        this.getPosition().changeBy(myDirection.getDirection());
    }
}
