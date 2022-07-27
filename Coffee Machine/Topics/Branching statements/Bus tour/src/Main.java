import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAr = input.split(" ");
        int height = Integer.parseInt(inputAr[0]);
        int maxBrigdes = Integer.parseInt(inputAr[1]);
        int counter = 0;
        while (scanner.hasNext()) {
            int brideHeight = scanner.nextInt();
            counter++;
            if (brideHeight <= height) {
                System.out.printf("Will crash on bridge %d", counter);
                break;
            } else if (counter == maxBrigdes) {
                System.out.println("Will not crash");
                break;
            }
        }

    }
}