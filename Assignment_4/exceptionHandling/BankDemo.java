package exceptionHandling;

import java.util.*;

public class BankDemo {
    public static void main(String[] args) throws InsufficientBalanceException, WrongPin, NoAccount {
        Bank sbi = new Bank("State Bank of India", "Madurai");
//        Customer karthi = new Customer("Karthi", 30, 12345);
//
//        int karthiAccountNUmber = sbi.createAccount(karthi);
//        System.out.println("Account number : " + karthiAccountNUmber + "\n");

        boolean start = true;
        Scanner sc = new Scanner(System.in);
        while (start) {
            System.out.println(" 1. create Account \n 2. get customer details  \n 3. add money \n 4. withdraw \n 0. exit");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1 :
                    System.out.println("Enter account holder name");
                    String name = sc.nextLine();
                    System.out.println("Enter age : ");
                    int age = sc.nextInt();
                    System.out.println("Set Pin Number : ");
                    int pin = sc.nextInt();
                    int number = sbi.createAccount(new Customer(name, age, pin));
                    System.out.println("Your Account number : " + number);
                    break;
                case 2 :
                    System.out.println("Enter account number : ");
                    int accountNumber = sc.nextInt();
                    sbi.getCustomerDetail(accountNumber);
                    break;
                case 3 :
                    System.out.println("Enter account number : ");
                    int accountNumber1 = sc.nextInt();
                    System.out.println("enter money : ");
                    int money = sc.nextInt();
                    sbi.addMoney(accountNumber1, money);
                    break;
                case 4 :
                    sbi.withdraw();
                    break;
                case 0 :
                    start = false;
                    System.out.println("Service Stoped!");
            }
        }
    }
}

class Bank {
    private final String name;
    private final String branch;
    private static List<Account> customers;
    private static Set<Integer> accountNumbers;

    public Bank(String name, String branch) {
        this.name = name;
        this.branch = branch;
        this.customers = new ArrayList<>();
        this.accountNumbers = new HashSet<>();
    }

    public int createAccount(Customer customer) {
        Scanner sc = new Scanner(System.in);

        String name = customer.getName();
        int age = customer.getAge();
        int pin = customer.getPin();

        Account temp = new Account(name, age, pin);
        customers.add(temp);

        System.out.println("Account Created Successfully!!!");
        accountNumbers.add(temp.getAccountNumber());
        return temp.getAccountNumber();
    }

    public void addMoney(int accountNumber, int money) {
        for (Account ac : customers) {
            if (ac.getAccountNumber() == accountNumber) {
                if (ac.addMoney(money)) {
                    System.out.println("Money added successfully!");
                }

            }
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number : ");
        int accountNumber = sc.nextInt();

        try {
            if (accountNumbers.contains(accountNumber)) {
                System.out.println("Enter pin :");
                int pin = sc.nextInt();

                for (Account ac : customers) {
                    if (ac.getAccountNumber() == accountNumber) {
                        try {
                            if (ac.getPin() == pin) {
                                System.out.println("Enter withdraw amount : ");
                                int amount = sc.nextInt();

                                try {
                                    if (amount > ac.getBalance()) {
                                        throw new InsufficientBalanceException();
                                    } else {
                                        ac.withdraw(amount);
                                        System.out.println("Withdrawal amount :" + amount + " is taken!");
                                    }
                                } catch (InsufficientBalanceException e) {
                                    System.out.println(e);
                                } finally {
                                    break;
                                }
                            } else {
                                throw new WrongPin();
                            }
                        }
                        catch (WrongPin e){
                            System.out.println(e);;
                        }

                    }
                }
            } else {
                throw new NoAccount();
            }
        } catch (NoAccount e) {
            System.out.println(e);
        }
    }

    public void getCustomerDetail(int accountNumer) {
        for (Account ac : customers) {
            if (ac.getAccountNumber() == accountNumer) {
                System.out.println("Account Number : " + ac.getAccountNumber() + "\n" +
                                    "Name : " + ac.getName() + "\n" +
                                    "Balance : " + ac.getBalance());
                break;
            }
        }
    }
}

class Account {
    private final int ACCOUNT_NUMBER;
    private String name;
    private int age;
    private int pin;
    private static double balance = 0;
    private static int accountNumberGenerator = 10001;

    public Account(String name, int age, int pin) {
        this.name = name;
        this.age = age;
        this.pin = pin;
        this.ACCOUNT_NUMBER = accountNumberGenerator++;
    }

    public int getAccountNumber() {
        return this.ACCOUNT_NUMBER;
    }

    public String getName() {
        return name;
    }

    public static double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public boolean addMoney(double money) {
        this.balance += money;
        return true;
    }

    public boolean withdraw(int money) {
        this.balance -= money;
       return true;
    }
}

class Customer {
    private String name;
    private int age;
    private int pin;

    public Customer(String name, int age, int pin) {
        this.name = name;
        this.age = age;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPin() {
        return pin;
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException() {
        super("Insufficient Balance!");
    }
}
class WrongPin extends Exception {
    public WrongPin() {
        super("Invalid Pin!");
    }
}

class NoAccount extends Exception{
    public NoAccount() {
        super("No Account for this ACCOUNT_NUMBER!");
    }
}
