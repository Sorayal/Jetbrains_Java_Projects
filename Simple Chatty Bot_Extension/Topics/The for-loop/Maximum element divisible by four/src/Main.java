import java.util.Scanner;

class Main {
    private static final int SEARCHED = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int maximum = 0;
        for (int i = 0; i < elements; i++) {
            int value = scanner.nextInt();
            if (value % SEARCHED == 0 && value > maximum) {
                maximum = value;
            }
        }
        System.out.println(maximum);
    }
}