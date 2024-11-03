public class EmployeeWithConstructor {
    private final int ID;
    private String name;
    private int age;
    private int yearsOfExperience;
    private String designation;
    private float salary;

    private static int idGenerator = 1;

    public EmployeeWithConstructor(String name, int age, int experience, String designation, float salary) {
        this.ID = idGenerator++;
        this.name = name;
        this.age = age;
        this.yearsOfExperience = experience;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void details() {
        System.out.println("Employee Id : " + this.ID + "\n" +
                            "Name : " + this.name + "\n" +
                            "Age : " + this.age + "\n" +
                            "Year of experience : " + this.yearsOfExperience + "\n" +
                            "Designation : " + this.designation + "\n" +
                            "Salary : " + this.salary + "\n"
                        );
    }

}

class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeWithConstructor thirumala = new EmployeeWithConstructor("Thirumalai", 21, 1, "Web developer", 50000.0f);
        EmployeeWithConstructor muthuKumar = new EmployeeWithConstructor("Muthu Kumar", 23, 2, "Android developer", 70000.0f);
        thirumala.details();
        muthuKumar.details();
    }
}
