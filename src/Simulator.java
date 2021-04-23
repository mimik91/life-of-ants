


public class Simulator {
    private static Colony colony;

    public static void main(String[] args) {
        colony = new Colony(9);
        colony.printBoard();
        System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
    }


}
