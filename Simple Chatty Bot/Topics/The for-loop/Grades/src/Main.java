import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTests = scanner.nextInt();
        scanner.nextLine();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 0; i < numberTests; i++) {
            String grade = scanner.nextLine();
            switch (grade) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;
                default:
                    throw new IllegalArgumentException("Not a valid grade");

            }
        }
        System.out.printf("%d %d %d %d", countD, countC, countB, countA);

    }
}