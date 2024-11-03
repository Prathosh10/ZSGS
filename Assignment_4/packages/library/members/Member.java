package packages.library.members;

public class Member {
    private int studentId;
    private String name;
    private static int autoId = 1;

    public Member(String name) {
        this.studentId = autoId;
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
