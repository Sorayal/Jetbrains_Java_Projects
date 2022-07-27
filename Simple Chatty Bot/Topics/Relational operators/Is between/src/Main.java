import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int lowerLimit = second;
        int upperLimit = third;
        if (second > third) {
            lowerLimit = third;
            upperLimit = second;
        }
        System.out.println(numberToCheck >= lowerLimit && numberToCheck <= upperLimit);
    }
}