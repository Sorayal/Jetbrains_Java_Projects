import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String shapeIntro = "You have chosen a";
        switch (choice) {
            case "1":
                System.out.printf("%s square", shapeIntro);
                break;
            case "2":
                System.out.printf("%s circle", shapeIntro);
                break;
            case "3":
                System.out.printf("%s triangle", shapeIntro);
                break;
            case "4":
                System.out.printf("%s rhombus", shapeIntro);
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}