import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        final int minFirst = -15;
        final int maxFirst = 12;
        final int minSecond = 14;
        final int maxSecond = 17;
        final int minThird = 19;
        final boolean firstConditionTrue = input > minFirst && input <= maxFirst;
        final boolean secondConditionTrue = input > minSecond && input < maxSecond;
        final boolean thirdConditionTrue = input >= minThird;
        final boolean atLeastOneConditionTrue = firstConditionTrue || secondConditionTrue || thirdConditionTrue;

        if (atLeastOneConditionTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}