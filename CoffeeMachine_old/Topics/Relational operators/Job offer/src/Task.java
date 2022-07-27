// You can experiment here, it won’t be checked

public class Task {
    public static void main(String[] args) {

        Applicant john = new Applicant("John", true, 1, false, 0);
        Applicant mary = new Applicant("Mary", false, 0, true, 3);
        Applicant olivia = new Applicant("Olivia", true, 0, true, 2);
        Applicant alexander = new Applicant("Alexander", true, 3, true, 2);
        Applicant andrew = new Applicant("Andrew", false, 1, false, 1);
        Applicant emily = new Applicant("Emily", false, 0, true, 2);

        boolean hasEnoughJavaExperience = hasEnoughJavaExperience(emily.isKnowJava(), emily.getYearsOfExperienceInJava());


    }

    public static boolean hasEnoughJavaExperience(boolean knowJava, int yearsOfExperience) {
        return knowJava && yearsOfExperience >= 1;
    }

    public static boolean hasEnoughPythonExperience(boolean knowPython, int yearsOfExperience) {
        return knowPython && yearsOfExperience >= 3;
    }
}
