package packages.university.courses;

public class Course {
    private int courseId;
    private static int autoId = 1;
    private String name;
    private String semester;
    private int coursePoint;

    public Course(String name, String semester) {
        this.courseId = autoId++;
        this.name = name;
        this.semester = semester;
        this.coursePoint = 3;
    }

    public int getCoursePoint() {
        return coursePoint;
    }
}
