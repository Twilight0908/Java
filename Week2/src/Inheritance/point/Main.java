package Inheritance.point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1, 2);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1);
        System.out.println(point3D);

        point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        System.out.println("-------------------");

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(1, 1);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(1, 1, 2, 2);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
