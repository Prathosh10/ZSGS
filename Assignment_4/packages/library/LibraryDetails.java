package packages.library;

import packages.library.books.Book;
import packages.library.members.Member;
import packages.library.transactions.Transaction;

public class LibraryDetails {
    public static void main(String[] args) {
        Book rabitAndTortise = new Book("Rabbit and tortise", "Thirumalai");
        Member muthu = new Member("muthu kumar");
        Transaction ts = new Transaction(1,"Rabbit and tortise","10-02-2024", "20-02-2024");

        System.out.println(rabitAndTortise.getBookName());
        System.out.println(muthu.getStudentId());
        System.out.println(ts.getNoOfBooksTaken());
    }
}
