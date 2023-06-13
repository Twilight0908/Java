package Inheritance.geometry;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getside() {
        return super.getWidth();
    }

    public void setSquare(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
}
