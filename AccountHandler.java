package ConsulnetLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

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
    public void showBorrowedItem(int userID){
        for (BorrowedItem borrowedItem : borrowedItems){
            if (borrowedItem.getUserID() == userID){
                System.out.println(borrowedItem.toString());
            }
        }
    }


    public void deleteItem(int userID, int bookID){
        for (BorrowedItem itemdetail : borrowedItems){
            if (userID== itemdetail.getUserID() && bookID == itemdetail.getBookID()){
                borrowedItems.remove(itemdetail);
            }
        }
    }



    public void calculatePenalty(int userID, int bookID){
        for (BorrowedItem itemdetail : borrowedItems){
            if (userID== itemdetail.getUserID() && bookID == itemdetail.getBookID()){
                overDueDays = (Period.between(itemdetail.getBorrowDate(), LocalDate.now())).getDays();
                if (overDueDays == 0) {
                    System.out.println("no charges applied");
                    break;
                }else{
                    for (t list: userList){
                        if (list instanceof Student){
                            if (overDueDays> ((Student) list).getBookBorrowDuration()){
                                list.setPenaltyCharges(overDueDays*list.getPenaltyAmount());
                                System.out.println(list.getPenaltyCharges());
                            }
                        }else if (list instanceof Teacher){
                            if (overDueDays> ((Teacher) list).getBookBorrowDuration()){
                                list.setPenaltyCharges(overDueDays*list.getPenaltyAmount());
                                System.out.println(list.getPenaltyCharges());
                            }

                        }
                    }
                }
            }


        }
    }

//    public  void addTeacherAccount(String userType, int userID, String name, String dept){
//        userList.add(new Teacher(userType,userID,name,dept));
//    }




}
