package packages.library.transactions;

import packages.university.students.Student;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private int studentId;
    private String book;
    private String dateTaken;
    private String dateReturn;
    private static List<Transaction> datas;
    private int noOfBooksTaken;
    private static int count = 1;

    public Transaction(int studentId, String book, String dateTaken, String dateReturn) {
        this.studentId = studentId;
        this.book = book;
        this.dateTaken = dateTaken;
        this.dateReturn = dateReturn;
        count++;
    }

    public int getNoOfBooksTaken() {
        return count - 1;
    }
}
