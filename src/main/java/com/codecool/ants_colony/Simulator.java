package com.codecool.ants_colony;

import com.codecool.ants_colony.logic.KeyListener;



public class Simulator {
    private final Colony colony;

    public Simulator(){
        colony = new Colony(9);
        System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.start();
    }

    private void start() {
        KeyListener keyboard = new KeyListener();
        KeyListener.Key key;

        do {
            key = keyboard.getKeyPressed();

            switch (key) {
                case ENTER:
                    colony.makeMove();
                    break;
            }
        } while(key != KeyListener.Key.Q);

    }
}
