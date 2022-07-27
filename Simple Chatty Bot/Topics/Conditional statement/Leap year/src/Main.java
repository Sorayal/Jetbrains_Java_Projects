import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap = checkIfLeap(year);
        System.out.println(isLeap ? "Leap" : "Regular");
    }

    public static boolean checkIfLeap(int year) {
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        boolean isWithinBounds = year >= 1900 && year <= 3000;
        return isLeapYear && isWithinBounds;
    }
}