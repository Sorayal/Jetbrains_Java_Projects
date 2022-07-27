import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (0 == input) {
                break;
            }
            System.out.println(0 == input % 2 ? "even" : "odd");
        }
    }
}