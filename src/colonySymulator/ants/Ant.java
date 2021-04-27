package colonySymulator.ants;

import colonySymulator.geometry.Coordynates;

public abstract class Ant {
    private Coordynates position;
    private final char symbol;

    protected Ant(char symbol, Coordynates position) {
        this.symbol = symbol;
        this.position = position;
    }

    public abstract void move(int size);

    public char getSymbol(){
        return this.symbol;
    }

    public void setPosition(Coordynates position) {
        this.position = position;
    }

    public Coordynates getPosition() {
        return position;
    }
}
