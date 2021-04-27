package colonySymulator.geometry;

public class Coordynates {
    public int x;
    public int y;

    public Coordynates(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void changeBy(Coordynates direction){
        if (this.x + direction.x >=  0 && this.x + direction.x <9){
            this.x += direction.x;
        }
        if (this.y + direction.y >=  0 && this.y + direction.y <9) {
            this.y += direction.y;
        }
    }


    public void pushToEdge(int boardSize){
        Coordynates direction = randomEdge(boardSize);
        if (direction.x == 0){
            direction.x = getRandomLengthFromCenter();
        }
        else {
            direction.y = getRandomLengthFromCenter();
        }
        changeBy(direction);

    }

    private int randomCoordinate(int boardSize){
        return (int)(Math.random() * (boardSize-1));
    }

    private int getRandomLengthFromCenter(){
        return (int) Math.round(Math.random()* 8) - 4;
    }

    private Coordynates randomEdge(int boardSize){
        RandomDirection randomDirection = new RandomDirection();
        Coordynates direction = randomDirection.get().getDirection();
        direction = new Coordynates(direction.x * (int)(Math.ceil(boardSize /2)), direction.y * (int)(Math.ceil(boardSize /2)));
        return direction;
    }
}