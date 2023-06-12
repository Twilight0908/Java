package Inheritance.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2);
        System.out.println(cylinder);

        cylinder = new Cylinder(2, "red", 3);
        System.out.println(cylinder);
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
