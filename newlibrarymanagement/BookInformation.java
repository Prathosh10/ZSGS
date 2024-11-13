import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInformation {

    private static List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public static void bookEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Title");
        String bookTitle = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Author Name");
        String authorName = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Publishers Name");
        String publisherName = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Book Id");
        String bookId = scanner.nextLine();

        Book myBooks = new Book(bookTitle, authorName, publisherName, bookId);
        books.add(myBooks);
        System.out.println("List of Available books:");
        for (Book book : books) {
            System.out.println(book.getBookTitle());
        }

    }

    public static void main(String[] args) {
        System.out.println();
    }
}

class Book {
    private String bookTitle;
    private String authorName;
    private String publisherName;
    private String bookId;

    public Book(String bookTitle, String authorName, String publisherName, String bookId) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getBookId() {
        return bookId;
    }
}
