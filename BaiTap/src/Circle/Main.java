package Circle;

public class Main {
    public static void main(String[] args) {
        /*
        Circle circle=new Circle();
        System.out.println(Circle.id);
        System.out.println(circle.area());

        Circle circle1=new Circle(2);
        System.out.println(Circle.id);
        System.out.println(circle1.area());

        Circle circle2=new Circle(3);
        System.out.println(Circle.id);
        System.out.println(circle2.area());

        Circle circle3=new Circle(4);
        System.out.println(Circle.id);
        System.out.println(circle3.area());

        Circle[] circles=new Circle[]{circle,circle1,circle2,circle3};
        System.out.println(Circle.maxRadius(circles));
        System.out.println("Total area: "+Circle.totalArea(circles));
         */

        Circle2 circle2=new Circle2();
        Circle2 circle21=new Circle2(2);
        System.out.println(circle2.info);
        System.out.println(circle21.info);
    }
}
