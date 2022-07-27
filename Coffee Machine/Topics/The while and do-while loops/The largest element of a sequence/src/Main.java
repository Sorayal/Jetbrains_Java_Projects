import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int maximum = 0;
        do {
            input = scanner.nextInt();
            maximum = Math.max(input, maximum);
        } while (input != 0);
        System.out.println(maximum);
    }


    /*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int maximum = 0;
        do {
            input = scanner.nextInt();
            maximum = input <= maximum ? maximum : input;
        } while (input != 0);
        System.out.println(maximum);
    }
     */

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();
        int input;
        do {
            input = scanner.nextInt();
            sequence.add(input);
        } while (input != 0);
        System.out.println(Collections.max(sequence));
    }

     */
}