package Circle;

public class Circle2 {
    private static final double PI = 3.14;
    private static int id = 0;
    private double radius;
    public String info;
    public static double maxRadius = 0;
    public static boolean isMaxRadius = false;
    public int count=0;

    public Circle2() {
        id++;
        if (maxRadius < this.radius) {
            isMaxRadius = true;
        } else {
            isMaxRadius = false;
        }

        if (isMaxRadius) {
            this.info = "Max Radius";
        } else {
            this.info = "";
        }
    }

    public Circle2(double radius) {
        this.radius = radius;
        id++;
        if (maxRadius < this.radius) {
            isMaxRadius = true;
        } else {
            isMaxRadius = false;
        }

        if (isMaxRadius) {
            this.info = "Max Radius";
        } else {
            this.info = "";
        }
    }
}
