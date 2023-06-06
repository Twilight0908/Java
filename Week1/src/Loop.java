import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        isPrime();
//        interestCalculator();
//        greateCommonFactor();
//        drawMenu();
//        drawMenu2();
//        xNumberPrime();
        prime100();
    }

    public static void isPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int x = scanner.nextInt();

        if (x < 2) {
            System.out.println(x + " is not a prime!");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(x + " is a prime!");
            } else {
                System.out.println(x + " is not prime!");
            }
        }
    }

    public static void interestCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }

    public static void greateCommonFactor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

            System.out.println("Greatest common factor: " + a);
        }
    }

    public static void drawMenu() {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void drawMenu2() {
        System.out.println("draw rectangle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("draw square triangle(botton-left)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("draw square triangle(top-left)");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static boolean checkPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void xNumberPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity prime: ");
        int count = scanner.nextInt();

        int i = 1;
        int j = 1;
        while (i <= count) {
            if (checkPrime(j)) {
                System.out.print(j + " ");
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    public static void prime100() {
        System.out.println("100 prime number");

        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
