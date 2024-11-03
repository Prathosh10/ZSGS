public class BookDTO {
    private String title;
    private String ISBN;
    private String author;
    private float price;
    private String publication;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
}
