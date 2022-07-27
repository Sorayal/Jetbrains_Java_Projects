import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLimit = scanner.nextInt();
        /*
        int base = 1;
        int square = 1;
        do {
            System.out.println(square);
            base++;
            square = base * base;
        } while (square <= maxLimit);
        */

        for (int i = 1; Math.pow(i, 2) <= maxLimit; i++) {
            System.out.println((int) Math.pow(i, 2));
        }
    }
}