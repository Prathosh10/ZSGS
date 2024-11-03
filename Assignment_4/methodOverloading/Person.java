public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getdetails() {
        System.out.println("Name : " + this.name);

        if (age != 0) {
            System.out.println("Age : " + this.age);
        }
        if (address != null) {
            System.out.println("Address : " + this.address);
        }
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person thiru = new Person("Thiru");
        Person mukesh = new Person("Mukesh", 20);
        Person suresh = new Person("Suresh", 30, "madurai");

        suresh.getdetails();
    }
}
