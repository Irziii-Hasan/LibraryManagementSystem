package ConsulnetLibrary;

public class Runner {
    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory();
        bookInventory.addBook(1,"Nimra Ahmed", "Mushaf",5);
        bookInventory.addBook(2,"Umaira Ahmed", "Mushaf",5);
        bookInventory.addBook(3,"Nimra Ahmed", "Mushaf",5);
        for (Book book: bookInventory.bookList){
            System.out.println(book);
        }

        if(bookInventory.bookAvailability("Mushaf")){
            bookInventory.borrowBook("Mushaf");
        }

        for (Book book: bookInventory.bookList){
            System.out.println(book);
        }

        AccountHandler accountHandler = new AccountHandler();
        accountHandler.addAccount(new Student("Student", 123,"Irza", "SE"));
        accountHandler.addAccount(new Student("Student", 124,"Sara", "SE"));
        accountHandler.addAccount(new Student("Student", 125,"Ayesha", "SE"));

        for (Object e: accountHandler.userList){
            System.out.println(e);
        }
        Student student=new Student("Student", 123,"Irza", "SE") ;
        System.out.println(student.toString());

    }
}
