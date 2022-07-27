import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean isPositive = input > 0;
        if (isPositive) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}