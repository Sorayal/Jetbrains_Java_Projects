import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqSize = scanner.nextInt();
        final int requestedDiv = 4;
        int result = 0;

        while (seqSize > 0) {
            int number = scanner.nextInt();
            //result = 0 == number % requestedDiv && number > result ? number : result;
            if (0 == number % requestedDiv && number > result) {
                result = number;
            }
            seqSize--;
        }
        System.out.println(result);
        scanner.close();
    }
}