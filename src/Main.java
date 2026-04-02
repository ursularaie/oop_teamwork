import java.util.Scanner;

public class Main {
    public static void main() {

        Screen screen = new Screen(800, 600);
        double[] coordinates = new double[] {(double) screen.getX() / 2, (double) screen.getY() / 2}; // pall on alguses ala keskel
        double algne_kiirus = (Math.random() * 20 + 1);
        Ball ball = new Ball(userAnswerBallRadius(), new double[]{algne_kiirus, algne_kiirus}, coordinates, userAnswerGravity()); // kiirused on random suurused ja alguses võrdsed, raadius tuleb kasutajalt

        System.out.println(ball); // algsed palli väärtused

        while (true) {
            double stop = ball.setCoordinates(screen);
            System.out.println(ball);
            if (stop == 0.0) {
                System.out.println("Program finished.");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static double userAnswerBallRadius() {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter ball radius: ");
        String s1 = s.nextLine();
        try {
            return Double.parseDouble(s1);
        } catch (NumberFormatException e) {
            return 5.0;
        }
    }

    public static boolean userAnswerGravity() {
        Scanner s = new Scanner(System.in);

        System.out.println("Use gravity? [Y/n] ");
        String s2 = s.nextLine();
        s.close();

        return !s2.equals("n");
    }
}


