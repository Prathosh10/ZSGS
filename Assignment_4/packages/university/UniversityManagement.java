package packages.university;

import packages.university.courses.Course;
import packages.university.faculty.Faculty;
import packages.university.students.Student;

public class UniversityManagement {
    public static void main(String[] args) {
        Student thiru = new Student("Thiru", 23, "IT");
        Faculty mukesh = new Faculty("Mukesh", 40, "CSE", 16);
        Course bioTech = new Course("Bio-Tech", "VI");

        System.out.println(thiru.getAge());
        System.out.println(mukesh.getExperience());
        System.out.println(bioTech.getCoursePoint());
    }
}
