package ConsulnetLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class User {
    private static int count =0;
    private int userID;
    private String name;
    private String dept;
    private String userType;
    private LocalDate enrollDate;
    private LocalDate expiryDate;
    private int noOfBookBorrow;
    private int borrowBookLimit;
    private final int charges= 10;
    private int paneltyCharges;


    public int getCharges() {
        return charges;
    }



    public int getPaneltyCharges() {
        return paneltyCharges;
    }

    public void setPaneltyCharges(int paneltyCharges) {
        this.paneltyCharges = paneltyCharges;
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
        if (expiryDate.compareTo(LocalDate.now())<0){
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
