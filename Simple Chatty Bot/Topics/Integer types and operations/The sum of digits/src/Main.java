import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        final int numberOfDigits = 3;
        final int base = 10;
        int result = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            result += input % base;
            input = input / base;
        }
        System.out.println(result);
    }
}