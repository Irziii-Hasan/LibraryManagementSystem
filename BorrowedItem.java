package ConsulnetLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BorrowedItem {
    private static int recordID = 0;
    private int userID;
    private  int bookID;
    private LocalDate borrowDate;

    public BorrowedItem(int userID, int bookID){
        recordID+=1;
        this.userID = userID;
        this.bookID = bookID;
        this.borrowDate = LocalDate.now();
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public int getBookID() {
        return bookID;
    }

    public int getUserID() {
        return userID;
    }

}
