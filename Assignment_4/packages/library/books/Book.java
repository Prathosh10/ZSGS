package packages.library.books;

public class Book {
    private int id;
    private String name;
    private String author;
    private static int autoId = 1;

    public Book(String name, String author) {
        this.id = autoId++;
        this.name =name;
        this.author = author;
    }

    public String getBookName() {
        return this.name;
    }
}
