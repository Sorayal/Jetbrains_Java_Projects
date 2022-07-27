import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitted = input.split(" ");
        long firstNumber = Long.parseLong(splitted[0]);
        char operation = splitted[1].charAt(0);
        long secondNumber = Long.parseLong(splitted[2]);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/':
                if (0 == secondNumber) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(firstNumber / secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}