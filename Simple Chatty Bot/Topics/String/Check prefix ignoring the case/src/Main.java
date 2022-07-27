import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String valueToCheck = "J";
        boolean result = input.toUpperCase().startsWith(valueToCheck);
        System.out.println(result);
    }
}