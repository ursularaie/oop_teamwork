import java.util.Arrays;

public class Ball {
    private double radius;
    private double[] velocity;
    private double[] coordinates; // kui gravitatsioon, siis y + mis iganes jõud sellele avaldatakse
    private boolean gravity;

    public Ball(double radius, double[] velocity, double[] coordinates, boolean gravity) {
        this.radius = radius;
        this.velocity = velocity;
        this.coordinates = coordinates;
        this.gravity = gravity;
    }

    public double setCoordinates(Screen screen) {
        double[] info = movement(screen);
        this.coordinates[0] = info[0];
        this.coordinates[1] = info[1];
        return info[2];
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", velocity=" + Arrays.toString(velocity) +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }


    public double[] movement(Screen screen) { // hiljem äärte kontrollimiseks saaks kasutada ilmselt getWidth kuidagi
        double stop = 1.0;
        if (gravity) {
            velocity[1] = velocity[1] + (9.8 * 0.1); // hetkel ainult maa gravitatsioon, nii et ei ole muutujat vaja
        }
        coordinates[0] = coordinates[0] + (velocity[0]*0.1); // alguses liidab uued kohad
        coordinates[1] = coordinates[1] + (velocity[1]*0.1);

        if (coordinates[0] >= screen.getX()) { // kontrollib, et oleks ekraanis, kui ei ole keerab ümber
            velocity[0] = (velocity[0] * -1) * 0.8; // pall kaotab seina vastu põrgates natuke kiirust
            coordinates[0] = screen.getX(); // et ei jääks seina sisse vaid alustab äärest
        }

        if (coordinates[1] >= screen.getY()) {
            velocity[1] = (velocity[1] * -1) * 0.8;
            coordinates[1] = screen.getY();
        }

        if (coordinates[0] <= 0) {
            velocity[0] = (velocity[0] * -1) * 0.8;
            coordinates[0] = 0;
        }

        if (coordinates[0] <= 0) {
            velocity[1] = (velocity[1] * -1) * 0.8;
            coordinates[1] = 0;
        }
        if ((int) velocity[1] == 0 && coordinates[1] > 595 && coordinates[1] <= 600) {// kui kiirus y on peaaegu 0 ja pall on enam-vähem maas, siis lõppeb simulatsioon
            velocity[0] = 0;
            velocity[1] = 0;
            coordinates[1] = 600;
            stop = 0.0;
        }
        return new double[] {coordinates[0], coordinates[1], stop};
    }
}
