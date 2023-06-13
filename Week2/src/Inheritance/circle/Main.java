package Inheritance.circle;

import java.util.Arrays;

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

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3, "red");
        circles[2] = new ComparableCircle(2, "violet");

        System.out.println("Pre-sorted");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }

        System.out.println(circles[0].compareTo(circles[1]));
        System.out.println(circles[1].compareTo(circles[0]));
    }
}
