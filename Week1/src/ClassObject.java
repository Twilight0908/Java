import java.util.Date;
import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         Person myPerson = new Person("Java", 25);
         System.out.println(myPerson.sayHello() + " " + myPerson.name + " " + myPerson.age);
         System.out.println(myPerson.toString());

         System.out.print("Enter the width: ");
         double width = scanner.nextDouble();
         System.out.print("Enter the height: ");
         double height = scanner.nextDouble();

         Rectangle rectangle = new Rectangle(width, height);
         System.out.println(rectangle.display());
         System.out.println("Area: " + rectangle.getArea());
         System.out.println("Perimeter: " + rectangle.getPerimeter());

         System.out.print("Enter a: ");
         double a = scanner.nextDouble();
         System.out.print("Enter b: ");
         double b = scanner.nextDouble();
         System.out.print("Enter c: ");
         double c = scanner.nextDouble();
         QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

         if (quadraticEquation.getDiscriminant()<0){
         System.out.println("The equation has no roots");
         }else if (quadraticEquation.getDiscriminant()==0){
         System.out.println("The equation has one root: "+quadraticEquation.getRoot1());
         }else {
         System.out.println("The equation has no roots");
         System.out.println("X1 = "+quadraticEquation.getRoot1());
         System.out.println("X2 = "+quadraticEquation.getRoot2());
         }

         StopWatch stopWatch = new StopWatch();
         stopWatch.start();
         for (int i = 0; i < 10000; i++) {
         System.out.println(i);
         }
         stopWatch.stop();
         System.out.println("Start: " + stopWatch.startTime);
         System.out.println("Stop: " + stopWatch.endTime);

         System.out.println("Elapsed time in milliseconds: " + stopWatch.getElapsedTime());
         */
        Fan fan = new Fan();
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "Blue");
        System.out.println("Fan: " + fan.toString());
        System.out.println("Fan 1:" + fan1.toString());
        System.out.println("Fan 2:" + fan2.toString());

    }

    public static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String sayHello() {
            return "Hello";
        }

        public String toString() {
            return "My name is " + this.name + " " + this.age + " year old";
        }
    }

    public static class Rectangle {
        private double width, height;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return 2 * (this.width + this.height);
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }
    }

    public static class QuadraticEquation {
        double a, b, c;

        public QuadraticEquation() {
        }

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double getDiscriminant() {
            return Math.pow(this.b, 2) - 4 * this.a * this.c;
        }

        public double getRoot1() {
            return (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        }

        public double getRoot2() {
            return (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
        }
    }

    public static class StopWatch {
        private Date startTime, endTime;

        public StopWatch() {
            this.startTime = new Date();
        }

        public void start() {
            this.startTime = new Date();
        }

        public void stop() {
            this.endTime = new Date();
        }

        public long getElapsedTime() {
            return endTime.getTime() - startTime.getTime();
        }
    }

    public static class Fan {
        private static final int SLOW = 1;
        private static final int MEDIUM = 2;
        private static final int FAST = 3;

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan() {
            this.speed = SLOW;
            this.on = false;
            this.radius = 5;
            this.color = "Blue";
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            if (this.isOn()) {
                return "Speed " + this.getSpeed() + " Color " + this.getColor() + " Radius " + this.getRadius() + " Fan is on";
            } else
                return "Color " + this.getColor() + " Radius " + this.getRadius() + " Fan is off";
        }
    }
}
