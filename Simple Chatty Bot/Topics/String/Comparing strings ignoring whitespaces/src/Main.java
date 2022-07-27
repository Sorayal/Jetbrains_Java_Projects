import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String firstStripped = stripWhitespaces(firstInput);
        String secondStripped = stripWhitespaces(secondInput);
        System.out.println(firstStripped.equals(secondStripped));
    }

    public static String stripWhitespaces(String fromString) {
        return fromString.replaceAll("\\s+", "");
    }
}