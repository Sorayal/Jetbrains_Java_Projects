import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = input + 2;
        if (output % 2 == 0) {
            System.out.println(output);
        } else {
            System.out.println(output - 1);
        }
    }
}