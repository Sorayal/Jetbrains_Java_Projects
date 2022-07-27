import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            nameList.add(scanner.next());
        }
        if (!nameList.isEmpty()) {
            for (int i = nameList.size() - 1; i >= 0; i--) {
                System.out.println(nameList.get(i));
            }
        }
    }
}