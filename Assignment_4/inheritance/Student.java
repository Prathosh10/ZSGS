public class Student {
    private String name;
    private int age;
    private String place;

    public Student(String name, int age, String place) {
        this.name = name;
        this.age = age;
        this.place = place;
    }

    public void getDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Place : " + this.place);
    }
}

class ZSGSStudent extends Student{
    private String domain;

    public ZSGSStudent(String name, int age, String place) {
        super(name, age, place);
        this.domain = "Web developer";
    }
    public ZSGSStudent(String name, int age, String place, String domain) {
        super(name, age, place);
        this.domain = domain;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Domain : " + this.domain);
        System.out.println();
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student muthu = new ZSGSStudent("Muthu kumar", 23, "Tenkasi");
        Student suresh = new ZSGSStudent("Suresh kumar", 23, "Chennai", "Andriod");
        muthu.getDetails();
        suresh.getDetails();

    }
}
