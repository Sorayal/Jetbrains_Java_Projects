import java.util.Scanner;

import static java.lang.Math.sqrt;

class Main {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(calculateTriangleArea(a, b, c));
            }
            case "circle" -> {
                double r = scanner.nextDouble();
                System.out.println(calculateCircleArea(r));
            }
            case "rectangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(calculateRectangleArea(a, b));
            }
            default -> System.out.println("Not a valid shape");
        }
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }
}