package Ants;

import Geometry.Position;

public abstract class Ant {
    Position position;

    public Ant(Position position){
        this.position = position;
    }

    public abstract void changePosition();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
