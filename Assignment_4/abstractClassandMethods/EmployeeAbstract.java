public abstract class EmployeeAbstract {
    private int id;
    private String name;

    private static int idCounter = 1;

    public EmployeeAbstract(String name) {
        this.id = idCounter;
        this.name = name;
        idCounter++;
    }

    public abstract double calculatePay();

    public void getEmployeeDetails() {
        System.out.println("Employee id : " + this.id + " \n" +
                "Name : " + this.name);

    }
}

class HourlyEmployee1 extends EmployeeAbstract{
    private int hour;
    private double salary;

    public HourlyEmployee1(String name,int hour) {
        super(name);
        this.hour = hour;
//        calculatePay();
    }

    @Override
    public double calculatePay() {
        this.salary = (this.hour * 1000);
        return salary;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary : " + this.salary);
    }
}

class SalariedEmployee1 extends EmployeeAbstract{
    private double salary;

    public SalariedEmployee1(String name) {
        super(name);
        this.salary = 45000;
    }

    @Override
    public double calculatePay() {
        salary =  salary + 1000;
        return salary;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary : " + this.salary);
    }
}

class EmployeeDemo2 {
    public static void main(String[] args) {
        EmployeeAbstract mukesh = new HourlyEmployee1("Mukesh", 40);
        EmployeeAbstract thiru = new SalariedEmployee1("Thiru");

        mukesh.calculatePay();
        mukesh.getEmployeeDetails();
        System.out.println();

        thiru.getEmployeeDetails();
        System.out.println();
        thiru.calculatePay();
        thiru.getEmployeeDetails();
    }
}
