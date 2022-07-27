import java.util.Scanner;

class Main {
    private static final int FIZZ = 3;
    private static final int BUZZ = 5;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % FIZZ == ZERO && i % BUZZ == ZERO) {
                System.out.println("FizzBuzz");
            } else if (i % FIZZ == ZERO) {
                System.out.println("Fizz");
            } else if (i % BUZZ == ZERO) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}