package Ants;

import Geometry.Board;
import Geometry.Position;

public class Queen extends Ant{

    public Queen(Board board){
        super('Q');
        this.setPosition(board.getCenter());
        board.setOn(this.getSymbol(), this.getPosition());
    }


    @Override
    public void changePosition() {
    }

    public char getSymbol(){
        return this.symbol();
    }
}
