import java.util.Scanner;

class Main {
    private static final int LOWERBNDWEEKEND = 15;
    private static final int UPPERBNDWEEKEND = 25;
    private static final int LOWERBND = 10;
    private static final int UPPERBND = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println(cups <= UPPERBNDWEEKEND && cups >= LOWERBNDWEEKEND);
        } else {
            System.out.println(cups <= UPPERBND && cups >= LOWERBND);
        }
    }
}