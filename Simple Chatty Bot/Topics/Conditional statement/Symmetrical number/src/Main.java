import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        while (number != 0) {
            digits.add(number % 10);
            number = number / 10;
        }

        boolean isSymmetrical = digits.size() == 4 &&
                Objects.equals(digits.get(0), digits.get(3)) &&
                Objects.equals(digits.get(1), digits.get(2));
        System.out.println(isSymmetrical ? 1 : 0);
    }
}
