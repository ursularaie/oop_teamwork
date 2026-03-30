public class Main {
    static void main() {
        // siia tulen main stuff, nagu asjade loomine või meetotite käivitamine

        Screen screen = new Screen(800, 600); // algne näide, et balli saaks teha paremini
        Ball ball = new Ball((Math.random() * 10 + 1), 10, (Math.random() * 20 + 1));
        ball.setCoordinates((double) screen.getX() / 2, (double) screen.getY() / 2);
    }
}
