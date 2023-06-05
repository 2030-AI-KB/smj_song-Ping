package min;

public class Circle {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

}
