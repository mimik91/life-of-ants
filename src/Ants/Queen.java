package Ants;

import Geometry.Position;

public class Queen extends Ant{
    private final char symbol = 'Q';

    public Queen(Position position){
        super(position);
    }

    @Override
    public void changePosition() {
    }

    public char getSymbol(){
        return this.symbol;
    }
}
