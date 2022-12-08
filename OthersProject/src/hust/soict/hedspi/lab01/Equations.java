package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {
        while (true) {
            System.out.println("====== Menu ======");
            System.out.println("1. The first-degree equation (linear equation) with one variable");
            System.out.println("2. The system of first-degree equations (linear system) with two variables");
            System.out.println("3. The second-degree equation with one variable");
            System.out.print("Please choose the type of equation: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    firstDegreeEquationWithOneVariable();
                    break;
                case 2:
                    firstDegreeEquationWithTwoVariables();
                    break;
                case 3:
                    secondDegreeEquationWithOneVariable();
                    break;
                default:
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
            }

        }
    }

    /***
     * The first-degree equation (linear equation) with one variable
     */
    private static void secondDegreeEquationWithOneVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter the value of c: ");
        int c = scanner.nextInt();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        if (a == 0)
            firstDegreeEquationWithOneVariable(b, c);
        else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no solution!");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two solutions: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    /**
     * The system of first-degree equations (linear system) with two variables
     */
    private static void firstDegreeEquationWithTwoVariables() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of a11: ");
        int a11 = scanner.nextInt();
        System.out.print("Please enter the value of a12: ");
        int a12 = scanner.nextInt();
        System.out.print("Please enter the value of b1: ");
        int b1 = scanner.nextInt();
        System.out.print("Please enter the value of a21: ");
        int a21 = scanner.nextInt();
        System.out.print("Please enter the value of a22: ");
        int a22 = scanner.nextInt();
        System.out.print("Please enter the value of b2: ");
        int b2 = scanner.nextInt();
        System.out.println(a11 + "x + " + a12 + "y = " + b1 + "\n" + a21 + "x + " + a22 + "y = " + b2);
        int D = a11 * a22 - a12 * a21;
        int D1 = b1 * a22 - b2 * a12;
        int D2 = a11 * b2 - a21 * b1;
        if (D != 0) {
            int x = D1 / D;
            int y = D2 / D;
            System.out.println("x = " + x + "\ny  = " + y);
        } else if (D1 == 0 && D2 == 0 && D == 0)
            System.out.println("The equation has infinite solutions");
        else
            System.out.println("The equation has no solution");

    }

    public static void firstDegreeEquationWithOneVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the value of b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            System.out.println("The equation has one solution: " + (-b / a));
        }
    }

    public static void firstDegreeEquationWithOneVariable(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            System.out.println("The equation has one solution: " + (-b / a));
        }
    }
}