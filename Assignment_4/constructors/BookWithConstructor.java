import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookWithConstructor {
    private String title;
    private final String ISBN;
    private String author;
    private float price;
    private String publication;
    private int year;

    BookWithConstructor(String title, String ISBN, String author, float price, String publication, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.publication = publication;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void displayBook() {
        System.out.println("Book Name : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Publication : " + this.publication );
        System.out.println("Year : " + this.year);
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("Price : " + this.price);
    }
}

class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BookWithConstructor> books = new ArrayList<>();

        System.out.println("How may books want to add : ");
        int numberOfBooks = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("book name : ");
            String bookName = sc.nextLine();
            System.out.println("ISBN : ");
            String ISBN = sc.nextLine();
            System.out.println("author : ");
            String author = sc.nextLine();
            System.out.println("price :");
            float price = sc.nextFloat();
            System.out.println("publication : ");
            sc.nextLine();
            String publication = sc.nextLine();
            System.out.println("year :");
            int year = sc.nextInt();
            sc.nextLine();
            BookWithConstructor bookTemp = new BookWithConstructor(bookName, ISBN, author, price, publication, year);
            books.add(bookTemp);
            System.out.println("updated!");
        }

        for (BookWithConstructor book : books) {
            System.out.println("-----------------------------------------------");
            book.displayBook();
        }
        System.out.println("-----------------------------------------------");

    }
}

// Java All In One, 978-1-119-24779-1, Doug Lowe, 599.0f, for dummies, 2017
