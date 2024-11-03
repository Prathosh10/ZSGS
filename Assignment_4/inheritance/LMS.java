package inheritance;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    private String userType;
    private String userName;
    private int password;

    public LMS(String userType, String userName, int password) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
    }

    public LMS() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void Login() {

    }

    public void register(){

    }

    public void logout() {

    }
}

class User extends LMS{
    private String name;
    private int ID;

    public User(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public User() {

    }

    public void verify() {

    }

    public void checkAccount() {

    }

    public void getBookInfo() {

    }
}

class Account extends User{
    private int noOfBorrowedBooks;
    private int noOfReservedBooks;
    private int noOfReturnedBooks;
    private int noOfLostBooks;
    private int fineAmount;

    public Account() {
        super();
    }

    public void calculateFine() {

    }
}

class Book extends LMS{
    private String title;
    private String author;
    private final String ISBN;
    private String publication;

    public Book(String ISBN, String title, String author, String publication) {
        super();
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publication = publication;
    }

    public void showDueDate() {

    }
    public void reservationStatus() {

    }

    public void feedback() {

    }

    public void bookRequest() {

    }

    public void renwInfo() {

    }
}

class Librarian extends LMS{
    private String Name;
    private int ID;
    private int password;
    private String searchString;


    public Librarian(String name, int ID, int password, String searchString) {
        Name = name;
        this.ID = ID;
        this.password = password;
        this.searchString = searchString;
    }

    public void verifyLibrarian() {

    }

    public void Search() {

    }
}

class LibraryDatabase {
    private static List<Book> list_of_books;

    public LibraryDatabase() {
        list_of_books = new ArrayList<>();
    }

    public void add() {

    }

    public void delete() {

    }

    public void update() {

    }

    public void display() {

    }

    public void search() {

    }
}

class Staff {
    private String department;

    public Staff(String department) {
        this.department = department;
    }
}

class Student {
    private String classs;

    public Student(String Classs) {
        this.classs = classs;
    }
}
