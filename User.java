package ConsulnetLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public abstract class User {
    private int userID;
    private String name;
    private String dept;
    private String userType;
    private String enrollDate;
    private String expiryDate;


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

    public String getEnrollDate() {
        return enrollDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

     void enrollUser(String userType, int userID, String name, String dept){
        this.userType = userType;
         this.userID = userID;
         this.name = name;
         this.dept = dept;
         this.enrollDate = (LocalDate.now()).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
         this.expiryDate = (LocalDate.now().plusYears(1)).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));;
     }

     public String toString(){
         return "=====  ===  User Details  ===  =====\n" +
                 "User Type: "+userType+"\n" +
                 "ID: "+userID+"\t" + "Name: "+name+"\n" +
                 "Card Valid from: "+enrollDate+"\t" +
                 "to: "+expiryDate+"\n" +
                 "=====      X==X==X==X==X      =====\n";     }
}
