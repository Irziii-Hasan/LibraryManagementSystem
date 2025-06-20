package ConsulnetLibrary;

import java.time.LocalDate;

public abstract class User {
    private static int count =0;
    private int userID;
    private String name;
    private String dept;
    private String userType;
    private final LocalDate enrollDate;
    private final LocalDate expiryDate;
    private int noOfBookBorrow;
    private int borrowBookLimit;
    private final int penaltyAmount = 10;
    private int penaltyCharges;


    protected int getPenaltyAmount() {
        return penaltyAmount;
    }



    public int getPenaltyCharges() {
        return penaltyCharges;
    }

    public void setPenaltyCharges(int penaltyCharges) {
        this.penaltyCharges = penaltyCharges;
    }




    public User(String userType, String name, String dept){
        this.userType = userType;
        this.userID = count;
        count++;
        this.name = name;
        this.dept = dept;
        this.enrollDate = LocalDate.now();
        this.expiryDate = LocalDate.now().plusYears(1);
    }

    public abstract void setNoOfBookBorrow(boolean isBorrow);

    public abstract int getNoOfBookBorrow();

    public abstract int getBorrowBookLimit();

    public boolean checkCardValidity(){
        if (expiryDate.isAfter(LocalDate.now())){
            return true;
        }else {
            return false;
        }
    }
    public boolean canBorrowBook(){
        if (noOfBookBorrow < borrowBookLimit){
            return true;
        }else {
            return false;
        }
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

     public String toString(){
         return "=====  ===  User Details  ===  =====\n" +
                 "User Type: "+userType+"\n" +
                 "ID: "+userID+"\t" + "Name: "+name+"\n" +
                 "Card Valid from: "+enrollDate+"\t" +
                 "to: "+expiryDate+"\n" +
                 "=====      X==X==X==X==X      =====\n";
    }


}
