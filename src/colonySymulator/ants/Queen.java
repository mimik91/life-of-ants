package colonySymulator.ants;

import colonySymulator.geometry.Coordynates;

public class Queen extends Ant {
    private boolean mood = true;
    private boolean mating = false;
    private int daysToGoodMood = 0;

    public Queen(Coordynates position) {
        super('Q', position);
    }

    @Override
    public void move(int size) {
        if (daysToGoodMood > 0){
            daysToGoodMood -= 1;
            System.out.println(daysToGoodMood);
        }
        else {
            mood = true;
        }
    }

    public void setMating(){
        this.mating = true;
    }

    public void finishMating(){
        this.mating = false;
        daysToGoodMood = (int)(Math.random()*(50))+50;
        this.mood = false;
    }

    public boolean getMood(){
        return this.mood;
    }

    public boolean getMating(){
        return this.mating;
    }
}
