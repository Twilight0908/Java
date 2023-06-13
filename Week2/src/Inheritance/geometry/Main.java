package Inheritance.geometry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Shape shape=new Shape();
        System.out.println(shape);

        shape=new Shape("red",false);
        System.out.println(shape);
         */

        /*
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle("black", true, 4);
        System.out.println(circle);
         */

        /*
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());

        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);

        rectangle = new Rectangle("white", true, 4, 5);
        System.out.println(rectangle);
         */

        /*
        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);

        square = new Square("yellow", true, 3);
        System.out.println(square);
         */

        Shape[] shapes = new Shape[3];

        Circle circle = new Circle();
        circle.resize(random());
        shapes[0] = circle;

        Rectangle rectangle = new Rectangle();
        rectangle.resize(random());
        shapes[1] = rectangle;

        Square square = new Square();
        square.resize(random());
        shapes[2] = square;

        System.out.println(Arrays.toString(shapes));
    }

    public static double random() {
        return (int) (Math.random() * 100) + 1;
    }
}
