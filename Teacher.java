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

    public Teacher(String userType, String name, String dept) {
        super(userType, name, dept);
    }
}
