


public class Simulator {
    private static Colony board;

    public static void main(String[] args) {
        board = new Colony(9);
        board.printBoard();
        System.out.println("You can use `mvn package; java -jar target/ants-1.0.jar` to run this app from the console");
    }


}
