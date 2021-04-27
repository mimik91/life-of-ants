package colonySymulator.geometry;


public enum Direction {
    NORTH(new Coordynates(0, -1)),
    EAST(new Coordynates(1, 0)),
    SOUTH(new Coordynates(0, 1)),
    WEST(new Coordynates(-1, 0));

    public final Coordynates direction;

    private Direction(Coordynates direction) {
        this.direction = direction;
    }

    public Coordynates getDirection() {
        return this.direction;
    }



}
