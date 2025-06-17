package ConsulnetLibrary;

import java.util.Scanner;

public class LibraryRunner{
    static BookInventory bookInventory = new BookInventory();
    static AccountHandler<Student> studentAccountHandler = new AccountHandler<>();
    static AccountHandler<Teacher> teacherAccountHandler = new AccountHandler<>();
    static Scanner scanner = new Scanner(System.in);


//    public static void showMenu(){
//        System.out.println("Enter option number you want to perform");
//        System.out.println("1: to show available books");
//        System.out.println("2: to create Student account");
//        System.out.println("3: to create Teacher account");
//        System.out.println("4: to jump into Student account");
//        System.out.println("5: to jump into Teacher account");
//
//    }
//
//
//    public static void studentAccount(){
//        System.out.print("Enter Student Name: ");
//        String stdName = scanner.nextLine();
//        System.out.print("Enter Student Department: ");
//        String stdDept = scanner.nextLine();
//        studentAccountHandler.addAccount(new Student("Student",stdName,stdDept));
//    }
//
//    public static void teacherAccount(){
//        System.out.print("Enter Teacher Name: ");
//        String teachName = scanner.nextLine();
//        System.out.print("Enter Student Department: ");
//        String teachDept = scanner.nextLine();
//        teacherAccountHandler.addAccount(new Teacher("Student",teachName,teachDept));
//    }

        public static void main(String[] args) {

//        String user ;
//        showMenu();

//        int userOption = scanner.nextInt();
//
//        switch (userOption){
//            case 1:
//                bookInventory.showAvailableBook();
//                break;
//            case  2:
//                studentAccount();
//                break;
//            case  3:
//                teacherAccount();
//                break;
//            case 4:
//                user = "Student";
//                break;
//            case 5:
//                user = "Teacher";
//                break;
//        }

            bookInventory.addBook("Nimra Ahmed", "Mushaf",5);
            bookInventory.addBook("Umaira Ahmed", "The Perfect Mentor",15);
            bookInventory.addBook("Anwar Maqsood", "Loose Talk",6);


            studentAccountHandler.addAccount(new Student("Student","Irza", "SE"));
            Student x =new Student("Student","Sara", "SE");
                    studentAccountHandler.addAccount(x);
            studentAccountHandler.addAccount(new Student("Student","Ayesha", "SE"));

            System.out.println();
            for (Student student : studentAccountHandler.userList) {
                System.out.println(student);
            }


            teacherAccountHandler.addAccount(new Teacher("Student","Hira", "SE"));
            teacherAccountHandler.addAccount(new Teacher("Student","Sana", "SE"));
            teacherAccountHandler.addAccount(new Teacher("Student","Fatima", "SE"));

            System.out.println();
            studentAccountHandler.showUserAccount();
            System.out.println();

            System.out.println("Enter user ID: ");
            int userid = scanner.nextInt();
            System.out.println();


            bookInventory.showAvailableBook();

            System.out.print("Enter book ID");
            int bookid = scanner.nextInt();
            if(bookInventory.bookAvailability(bookid)){
                bookInventory.borrowBook(bookid);
                studentAccountHandler.addItem(userid,bookid);

            }

            for (BorrowedItem borrowedItem : studentAccountHandler.borrowedItems) {
                System.out.println(borrowedItem);
            }


            System.out.println();


            bookInventory.showAvailableBook();

            if(x.checkCardValidity()){
                System.out.println( x.getUserID());
            }

            studentAccountHandler.calucaltePanelty(userid,bookid);
//            studentAccountHandler.deleteItem();

//        AccountHandler<Student> studentAccountHandler1 = new AccountHandler<>();
//
//        AccountHandler<Student> acc = new AccountHandler<>();
//        Student std = new Student("Student", "Irza", "SE");
//        acc.addAccount(std);
//        System.out.println(std);
//
//        bookInventory.showAvailableBook();
//
//        System.out.print("Enter book id:");
//        int a = scanner.nextInt();
//
//        boolean isAvailable = bookInventory.bookAvailability(a);
//        if (isAvailable){
//            bookInventory.borrowBook(a);
//
//        }
//
//        std.setNoOfBookBorrow(true);
//        System.out.println(std.getNoOfBookBorrow());

        bookInventory.showAvailableBook();


//        for (Object e: accountHandler.userList){
//            System.out.println(e);
//        }
//        Student student=new Student("Student", 123,"Irza", "SE") ;
//        System.out.println(student.toString());

    }
}
