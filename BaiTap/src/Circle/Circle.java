package Circle;

public class Circle {
    private static final double PI = 3.14;
    static int id = 0;
    private double radius;

    public Circle() {
        id++;
    }

    public Circle(double radius) {
        this.radius = radius;
        id++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * PI * this.radius;
    }

    public static String maxRadius(Circle[] circles) {
        double max = circles[0].radius;
        for (Circle init : circles) {
            if (max < init.radius) {
                max = init.radius;
            }
        }
        return "Max Radius: " + max;
    }

    public static double totalArea(Circle[] circles) {
        double total = 0;
        for (Circle init : circles) {
            total += init.area();
        }
        return total;
    }
}
