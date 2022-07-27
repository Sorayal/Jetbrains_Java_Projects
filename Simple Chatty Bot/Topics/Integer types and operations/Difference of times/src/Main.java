import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hourInSeconds = 3600;
        final int minuteInSeconds = 60;

        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int startSecond = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        int endSecond = scanner.nextInt();

        int startMoment = startHour * hourInSeconds + startMinute * minuteInSeconds + startSecond;
        int endMoment = endHour * hourInSeconds + endMinute * minuteInSeconds + endSecond;

        System.out.println(endMoment - startMoment);
    }
}