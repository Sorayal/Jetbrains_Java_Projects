import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        final int constraint = 20;

        boolean firstCheck = first + second == constraint;
        boolean secondCheck = first + third == constraint;
        boolean thirdCheck = second + third == constraint;
        boolean isTwenty = firstCheck || secondCheck || thirdCheck;
        System.out.println(isTwenty);
    }
}