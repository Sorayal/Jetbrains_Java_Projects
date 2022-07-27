import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean withinLowerBound = k >= n || k >= m;
        boolean withinUpperBound = k <= n * m;
        boolean isModulo = k % n == 0 || k % m == 0;
        boolean isExactly = withinLowerBound && withinUpperBound && isModulo;

        if (isExactly) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
K < N and K < M : always false
K > N x M : always false
K % N or K % M : true (within lower and upper bound)
 */