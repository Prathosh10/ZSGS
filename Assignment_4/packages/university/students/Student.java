package packages.university.students;

public class Student {
    private int studentId;
    private static int autoId = 1;
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.studentId = autoId++;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
