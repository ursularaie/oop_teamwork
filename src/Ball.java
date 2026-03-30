public class Ball {
    private double radius; // äkki see random, nt 1-10
    private double mass;
    private double velocity; // äkki see random, nt 1-20
    private double[] coordinates = new double[2];

    public Ball(double radius, double mass, double velocity) {
        this.radius = radius;
        this.mass = mass;
        this.velocity = velocity;
    }

    public void setCoordinates(double x, double y) { // alguses annab sellega balli algus kordinaadid
        // see on balli keskosa
        // võib põhimõtteliselt ka konstruktoris olla
        coordinates[0] = x;
        coordinates[1] = y;
    }
}
