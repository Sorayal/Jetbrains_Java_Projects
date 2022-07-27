import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limit = 10;
        boolean isBelowLimit = scanner.nextInt() < limit;
        System.out.println(isBelowLimit);
    }
}