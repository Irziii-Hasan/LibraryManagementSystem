package ConsulnetLibrary;

import java.util.ArrayList;
import java.util.Objects;

public class BookInventory {
    ArrayList<Book> bookList= new ArrayList<>();


    public void addBook(String author, String title, int quantity){
        bookList.add(new Book(author,title,quantity));
    }

    public boolean bookAvailability(int bookID){
        for (Book bookItem: bookList){
            if (bookItem.isAvailable()){
                return true;
            }
        }
        return false;
    }

    public void showAvailableBook(){
        for (Book bookItem: bookList){
            if (bookItem.isAvailable()){
                System.out.println(bookItem);
            }
        }
    }

    void borrowBook(int bookID){

        for (Book bookList: bookList){
            if (Objects.equals(bookList.getId(), bookID)){
                bookList.quantity-=1;
                break;

            }
        }
    }

    void returnBook(int bookID){

        for (Book bookList: bookList){
            if (Objects.equals(bookList.getId(), bookID)){
                bookList.quantity+=1;
                break;

            }
        }
    }



}
