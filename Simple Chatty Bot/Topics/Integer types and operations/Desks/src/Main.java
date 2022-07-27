import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int sumOfDesks = 0;

        sumOfDesks = calculateNumberOfDesks(firstNumber);
        sumOfDesks += calculateNumberOfDesks(secondNumber);
        sumOfDesks += calculateNumberOfDesks(thirdNumber);

        System.out.println(sumOfDesks);
    }

    public static int calculateNumberOfDesks(int students) {
        if (students % 2 == 0) {
            return students / 2;
        } else {
            return students / 2 + 1;
        }
    }
}