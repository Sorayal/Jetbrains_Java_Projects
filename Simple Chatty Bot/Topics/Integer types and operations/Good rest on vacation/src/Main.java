import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOneNight = scanner.nextInt();

        int resultCosts = (duration - 1) * costOneNight + 2 * oneWayFlightCost + foodCostPerDay * duration;
        System.out.println(resultCosts);
    }
}