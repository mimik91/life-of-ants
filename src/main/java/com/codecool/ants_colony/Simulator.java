package com.codecool.ants_colony;

import com.codecool.ants_colony.logic.KeyListener;



public class Simulator {
    private Colony board;

    public Simulator(){
        board = new Colony(10);
        board.printBoard();
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
                    System.out.println("PENIS");
                    break;
            }
        } while(key != KeyListener.Key.Q);

    }
}
