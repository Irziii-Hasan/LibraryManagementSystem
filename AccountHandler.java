package ConsulnetLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class AccountHandler <t extends User> {
    t data;
    private int overDueDays;
    ArrayList<t> userList = new ArrayList<>();
    ArrayList<BorrowedItem> borrowedItems= new ArrayList<>();


    public  void addAccount(t userDetail){
        userList.add(userDetail);
    }

    public void showUserAccount(){
        for (t user : userList){
            System.out.println(user);
        }
    }


    public void addItem(int userID, int bookID){
        borrowedItems.add(new BorrowedItem(userID,bookID));
    }


    public void deleteItem(int userID, int bookID){
        for (BorrowedItem itemdetail : borrowedItems){
            if (userID== itemdetail.getUserID() && bookID == itemdetail.getBookID()){
                borrowedItems.remove(itemdetail);
            }
        }
    }



    public void calucaltePanelty(int userID, int bookID){
        for (BorrowedItem itemdetail : borrowedItems){
            if (userID== itemdetail.getUserID() && bookID == itemdetail.getBookID()){
                overDueDays = (Period.between(itemdetail.getBorrowDate(), LocalDate.now())).getDays();
            }

            for (t list: userList){
                if (list instanceof Student){
                    if (overDueDays> ((Student) list).getBookBorrowDuration()){
                        list.setPaneltyCharges(overDueDays*list.getCharges());
                    }
                }else if (list instanceof Teacher){
                    if (overDueDays> ((Teacher) list).getBookBorrowDuration()){
                        list.setPaneltyCharges(overDueDays*list.getCharges());
                    }

                }
            }
        }
    }

//    public  void addTeacherAccount(String userType, int userID, String name, String dept){
//        userList.add(new Teacher(userType,userID,name,dept));
//    }




}
