import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        SystemTime();
//        RectArea();
        LinearEquationResolver();
    }

    public static void SystemTime() {
        Date now = new Date();
        System.out.println("Now is: " + now);
    }

    public static void RectArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        float width = scanner.nextFloat();

        System.out.println("Enter Height: ");
        float height = scanner.nextFloat();

        System.out.println("Area is: " + (width * height));
    }

    public static void LinearEquationResolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        System.out.println("a: ");
        float a = scanner.nextFloat();

        System.out.println("b: ");
        float b = scanner.nextFloat();

        System.out.println("c: ");
        float c = scanner.nextFloat();

        if (a != 0) {
            float answer = (c - b) / a;
            System.out.println("x = " + answer);
        } else {
            if (b == c) {
                System.out.println("all x");
            } else {
                System.out.println("no x");
            }
        }
    }
}