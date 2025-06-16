package ConsulnetLibrary;

import java.util.Scanner;

public class LibraryRunner {
    private static void showMenu(){
        System.out.println("Enter option number you want to perform");
        System.out.println("1: to show available books");
        System.out.println("2: to create Student account");
        System.out.println("3: to create Teacher account");
        System.out.println("4: to jump into Student account");
        System.out.println("5: to jump into Teacher account");

    }


    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory();
        AccountHandler<Student> studentAccountHandler = new AccountHandler<>();
        AccountHandler<Teacher> teacherAccountHandler = new AccountHandler<>();
        Scanner scanner = new Scanner(System.in);

        showMenu();

        int userOption = scanner.nextInt();

        switch (userOption){
            case 1:
                bookInventory.showAvailableBook();
                break;
            case  2:
                System.out.print("Enter Student Name: ");
                String stdName = scanner.nextLine();
                System.out.print("Enter Student Department: ");
                String stdDept = scanner.nextLine();
                studentAccountHandler.addAccount(new Student("Student",stdName,stdDept));
                break;
            case  3:
                System.out.print("Enter Teacher Name: ");
                String teachName = scanner.nextLine();
                System.out.print("Enter Student Department: ");
                String teachDept = scanner.nextLine();
                studentAccountHandler.addAccount(new Student("Student",teachName,teachDept));
                break;
        }

        bookInventory.addBook("Nimra Ahmed", "Mushaf",5);
        bookInventory.addBook("Umaira Ahmed", "Mushaf",5);
        bookInventory.addBook("Nimra Ahmed", "Mushaf",5);
        for (Book book: bookInventory.bookList){
            System.out.println(book);
        }

        if(bookInventory.bookAvailability(1)){
            bookInventory.borrowBook(1);
        }

        for (Book book: bookInventory.bookList){
            System.out.println(book);
        }

        AccountHandler<Student> studentAccountHandler1 = new AccountHandler<>();
        studentAccountHandler1.addAccount(new Student("Student","Irza", "SE"));
        studentAccountHandler1.addAccount(new Student("Student","Sara", "SE"));
        studentAccountHandler1.addAccount(new Student("Student","Ayesha", "SE"));

        AccountHandler<Student> acc = new AccountHandler<>();
        Student std = new Student("Student", "Irza", "SE");
        acc.addAccount(std);
        System.out.println(std);

        bookInventory.showAvailableBook();

        System.out.print("Enter book id:");
        int a = scanner.nextInt();

        boolean isAvailable = bookInventory.bookAvailability(a);
        if (isAvailable){
            bookInventory.borrowBook(a);

        }

        std.setNoOfBookBorrow(true);
        System.out.println(std.getNoOfBookBorrow());

        bookInventory.showAvailableBook();


//        for (Object e: accountHandler.userList){
//            System.out.println(e);
//        }
//        Student student=new Student("Student", 123,"Irza", "SE") ;
//        System.out.println(student.toString());

    }
}
