import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberParts = scanner.nextInt();
        scanner.nextLine();
        int fixCounter = 0;
        int rejectCounter = 0;
        int readyCounter = 0;

        for (int i = 0; i < numberParts; i++) {
            String size = scanner.nextLine();
            switch (size) {
                case "1":
                    fixCounter++;
                    break;
                case "-1":
                    rejectCounter++;
                    break;
                case "0":
                    readyCounter++;
                    break;
                default:
                    System.out.println("Not a valid size");
                    break;
            }
        }
        System.out.printf("%d %d %d", readyCounter, fixCounter, rejectCounter);
    }
}