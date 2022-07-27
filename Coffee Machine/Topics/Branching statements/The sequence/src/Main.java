import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumbers = scanner.nextInt();
        int loops = 0;
        exit:
        for (int i = 1; i <= maxNumbers; i++) {
            int counter = i;
            while (counter > 0) {
                System.out.printf("%d ", i);
                counter--;
                loops++;
                if (loops == maxNumbers) {
                    break exit;
                }
            }
        }
    }
}