import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String age;
        String stageOfEducation;
        String yearsOfExperience;
        String cuisinePreference;
        Scanner input = new Scanner(System.in);
        firstName = input.nextLine();
        age = input.nextLine();
        stageOfEducation = input.nextLine();
        yearsOfExperience = input.nextLine();
        cuisinePreference = input.nextLine();
        String output = "The form for " + firstName +
                " is completed. We will contact you if we need a chef that cooks " +
                cuisinePreference + " dishes.";
        System.out.println(output);

    }
}