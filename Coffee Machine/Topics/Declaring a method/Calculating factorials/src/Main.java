import java.util.Scanner;

public class Main {

    private static long result = 1;

    public static long factorial(long n) {
        if (n > 0) {
            result *= n;
            factorial(n - 1);
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}