public class Employee {
    private int id;
    private String name;

    private static int idCounter = 1;

    public Employee(String name) {
        this.id = idCounter;
        this.name = name;
        idCounter++;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee id : " + this.id + " \n" +
                            "Name : " + this.name);

    }
}

class HourlyEmployee extends Employee{
    private int hour;
    private double salary;

    public HourlyEmployee(String name,int hour) {
        super(name);
        this.hour = hour;
        salary = (this.hour * 1000);
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary : " + this.salary);
    }
}

class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name) {
        super(name);
        this.salary = 45000;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary : " + this.salary);
    }
}

class EmployeeDemo1 {
    public static void main(String[] args) {
        Employee mukesh = new HourlyEmployee("Mukesh", 40);
        Employee thiru = new SalariedEmployee("Thiru");

        mukesh.getEmployeeDetails();
        System.out.println();
        thiru.getEmployeeDetails();
    }
}
