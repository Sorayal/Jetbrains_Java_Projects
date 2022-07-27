import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean firstPairIsDifferent = a != b;
        boolean secondPairIsDifferent = a != c;
        boolean thirdPairIsDifferent = b != c;

        boolean isDifferent = firstPairIsDifferent && secondPairIsDifferent && thirdPairIsDifferent;
        System.out.println(isDifferent);
    }
}