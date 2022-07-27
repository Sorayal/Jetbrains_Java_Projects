import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();

        System.out.println(text.substring(lowerBound, upperBound + 1));
    }
}