package colonySymulator;

import colonySymulator.logic.Colony;
import colonySymulator.logic.KeyListener;



public class Simulator {
    private final ApplicationSettings settings;
    private final Colony colony;
    private final KeyListener keyListener;


    public Simulator(){
        settings = new ApplicationSettings();
        colony = new Colony(settings);
        keyListener = new KeyListener();
        System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.start();
    }

    private void start() {

        KeyListener.Key key;

        do {
            key = keyListener.getKeyPressed();

            switch (key) {
                case ENTER:
                    colony.makeMove();
                    break;
            }
        } while(key != KeyListener.Key.Q);

    }
}
