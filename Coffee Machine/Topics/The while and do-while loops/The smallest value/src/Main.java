import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long result = 1;
        long n = 0;
        while (result <= m) {
            result *= ++n;
        }
        // System.out.println(result);
        System.out.println(n);
    }
}