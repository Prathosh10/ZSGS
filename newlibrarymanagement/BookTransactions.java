import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookTransactions {

    private static final Scanner scanner = new Scanner(System.in);

    //Declaring map variable for adding the book and user details
    private static final Map<String, String> map = new HashMap<>();

    public static void borrowBook(BookInformation bookInformation, UserInformation userInformation) {

        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();

        System.out.println("Information from Borrow Books...");
        System.out.println("Book Info:");
        //Getting book detail
        for (Book book : bookBorrow) {
            System.out.println(book.getBookId() + " " + book.getBookTitle());
        }

        System.out.println("User Info");

        //Getting user detail
        for (User user : borrower) {
            System.out.println(user.getUserId() + " " + user.getUserName());
        }

        mapData(bookInformation, userInformation);
    }


    //here we are doing the mapping between the user and book based on the both ID's
    public static void mapData(BookInformation bookInformation, UserInformation userInformation) {
        boolean userVerification = false;
        boolean bookVerification = false;
        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();
        System.out.println("Enter the User Id:");
        String usersId = scanner.nextLine();
        System.out.println("Enter the Book id for Borrow:");
        String booksId = scanner.nextLine();

        for (User userElement : borrower) {

            if (userElement.getUserId().equals(usersId)) {
                userVerification = true;
                break;
            }
        }


        for (Book bookElement : bookBorrow) {
            if (bookElement.getBookId().equals(booksId)) {
                bookVerification = true;
                break;
            }
        }

        if (userVerification && bookVerification) {
            map.put(usersId, booksId);
        }

        for (Map.Entry<String, String> userBook : map.entrySet()) {
            System.out.println(userBook.getKey() + " " + userBook.getValue());

        }
    }

}
