public class Applicant {
    private String name;
    private boolean knowJava;
    private int yearsOfExperienceInJava;
    private boolean knowPython;
    private int yearsOfExperienceInPython;

    public Applicant(String name,
                     boolean knowJava,
                     int yearsOfExperienceInJava,
                     boolean knowPython,
                     int yearsOfExperienceInPython) {
        this.name = name;
        this.knowJava = knowJava;
        this.yearsOfExperienceInJava = yearsOfExperienceInJava;
        this.knowPython = knowPython;
        this.yearsOfExperienceInPython = yearsOfExperienceInPython;
    }

    public String getName() {
        return name;
    }

    public boolean isKnowJava() {
        return knowJava;
    }

    public int getYearsOfExperienceInJava() {
        return yearsOfExperienceInJava;
    }

    public boolean isKnowPython() {
        return knowPython;
    }

    public int getYearsOfExperienceInPython() {
        return yearsOfExperienceInPython;
    }
}
