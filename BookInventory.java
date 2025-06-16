package ConsulnetLibrary;

import java.util.ArrayList;
import java.util.Objects;

public class BookInventory {
    ArrayList<Book> bookList= new ArrayList<>();


    public void addBook(int id, String author, String title, int quantity){
        bookList.add(new Book(author,title,quantity));
    }

    public boolean bookAvailability(String bookTitle){
        for (Book bookList: bookList){
            if (Objects.equals(bookList.title, bookTitle)){

                return true;
            }
        }
        return false;
    }

    void borrowBook(String bookTitle){

        for (Book bookList: bookList){
            if (Objects.equals(bookList.title, bookTitle)){
                bookList.quantity-=1;
                break;

            }
        }
    }

    void returnBook(String bookTitle){

        for (Book bookList: bookList){
            if (Objects.equals(bookList.title, bookTitle)){
                bookList.quantity+=1;
                break;

            }
        }
    }



}
