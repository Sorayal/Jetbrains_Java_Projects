import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int result = min;

        for (int i = min + 1; i <= max; i++) {
            result += i;
        }
        System.out.println(result);
    }
}