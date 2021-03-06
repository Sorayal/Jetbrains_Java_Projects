import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder().append(n);
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            result.append(" ").append(n);
        }
        System.out.println(result);
    }
}