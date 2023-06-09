public class AccessModifier {
    public static void main(String[] args) {
        Student.change();

        Student student = new Student(111, "AAA");
        Student student1 = new Student(222, "BBB");

        student.display();
        student1.display();

        Car car = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car1 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }

    public static class Student {
        private int rollNo;
        private String name;
        private static String college = "BBDIT";

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getCollege() {
            return college;
        }

        public static void setCollege(String college) {
            Student.college = college;
        }

        static void change() {
            college = "CODEGYM";
        }

        void display() {
            System.out.println(rollNo + " " + name + " " + college);
        }
    }

    public static class Car {
        private String name, engine;
        public static int numberOfCar;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCar++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }
    }

    public static class Circle{
        private double radius;
        private String color;

        public Circle() {
            this.radius=1;
            this.color="Red";
        }
        public Circle(double radius,String color){
            this.radius=radius;
            this.color=color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
