import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int limit = 0;
        boolean firstAboveLimit = a > limit && b <= limit && c <= limit;
        boolean secondAboveLimit = b > limit && a <= limit && c <= limit;
        boolean thirdAboveLimit = c > limit && a <= limit && b <= limit;

        System.out.println(firstAboveLimit ^ secondAboveLimit ^ thirdAboveLimit);
    }
}