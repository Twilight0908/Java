package Inheritance.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * super.getPerimeter() + 2 * super.getArea();
    }

    @Override
    public double getPerimeter() {
        return 2 * (super.getPerimeter() + this.height);
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}
