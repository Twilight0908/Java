import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        SystemTime();
//        RectArea();
//        LinearEquationResolver();
//        DayOfMonth();
//        LeapYear();
//        Bmi();
//        ChangeMoney();
        NumberToString();
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

    public static void DayOfMonth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days?");
        int month = scanner.nextInt();
        String dayIsMonth;

        switch (month) {
            case 2:
                dayIsMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
                break;
        }

        if (!dayIsMonth.equals(""))
            System.out.printf("The month '%d' has %s days!", month, dayIsMonth);
        else
            System.out.println("Invalid input!");
    }

    public static void LeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        if (leapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d not a leap year", year);
        }
    }

    public static void Bmi() {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter your weight (kg)");
        weight = scanner.nextDouble();

        System.out.println("Enter your height (m)");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println(bmi + " Underweight");
        } else if (bmi < 25) {
            System.out.println(bmi + " Normal");
        } else if (bmi < 30) {
            System.out.println(bmi + " Overweight");
        } else {
            System.out.println(bmi + " Obese");
        }
    }

    public static void ChangeMoney() {
        Scanner scanner = new Scanner(System.in);
        final double vnd = 23485;

        System.out.println("Enter USD");
        double usd = scanner.nextDouble();

        System.out.println(usd * vnd + " VND");
    }

    public static void NumberToString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        String str = "";

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        if (tens == 0 && ones == 0) {
            str += getString(hundreds) + " Tram ";
        } else {
            if (hundreds != 0) {
                str += getString(hundreds) + " Tram ";
            }

            if (tens == 0) {
                str += " Linh ";
            } else {
                str += getString(tens) + " Muoi ";
            }

            if (ones != 0) {
                str += getString(ones);
            }
        }

        System.out.println(str);
    }

    public static String getString(int num) {
        String str = "";
        switch (num) {
            case 1:
                str = "Mot";
                break;
            case 2:
                str = "Hai";
                break;
            case 3:
                str = "Ba";
                break;
            case 4:
                str = "Bon";
                break;
            case 5:
                str = "Nam";
                break;
            case 6:
                str = "Sau";
                break;
            case 7:
                str = "Bay";
                break;
            case 8:
                str = "Tam";
                break;
            case 9:
                str = "Chin";
                break;
            default:
                str = "";
        }

        return str;
    }
}