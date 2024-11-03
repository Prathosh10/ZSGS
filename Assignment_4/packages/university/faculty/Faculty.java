package packages.university.faculty;

public class Faculty {
    private int facultyId;
    private static int autoId = 1;
    private String name;
    private int age;
    private String department;
    private int experience;

    public Faculty(String name, int age, String department, int experience) {
        this.facultyId = autoId++;
        this.name = name;
        this.age = age;
        this.department = department;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
