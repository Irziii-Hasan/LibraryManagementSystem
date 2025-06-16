package ConsulnetLibrary;

public class Student extends User{
    private final int borrowBookLimit=3;
    private int noOfBookBorrow=0;
    private int bookBorrowDuration = 90;

    public int getBookBorrowDuration() {
        return bookBorrowDuration;
    }



    @Override
    public void setNoOfBookBorrow(boolean isBorrow) {
        if (isBorrow){
            noOfBookBorrow+=1;
        }
        else {
            noOfBookBorrow-=1;

        }

    }

    @Override
    public int getNoOfBookBorrow() {
        return noOfBookBorrow;
    }

    @Override
    public int getBorrowBookLimit() {
        return borrowBookLimit;
    }

    public Student(String userType, String name, String dept) {
        super(userType, name, dept);
    }
}
