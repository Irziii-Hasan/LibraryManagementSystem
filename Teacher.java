package ConsulnetLibrary;

public class Teacher extends User{
    private int bookBorrowDuration = 180;
    private final int borrowBookLimit=5;
    private int noOfBookBorrow=0;

    public int getBookBorrowDuration() {
        return bookBorrowDuration;
    }

    @Override
    public void setNoOfBookBorrow(boolean isBorrow) {

    }

    @Override
    public int getNoOfBookBorrow() {
        return 0;
    }

    @Override
    public int getBorrowBookLimit() {
        return 0;
    }

    public Teacher(String userType, String name, String dept) {
        super(userType, name, dept);
    }
}
