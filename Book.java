package ConsulnetLibrary;

import java.util.ArrayList;

public class Book {
    ArrayList<Book> book= new ArrayList<>();

    int id;
    String title;
    String author;
    int quantity;

    public Book(int id, String title, String author, int quantity){
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    boolean isAvailable(){
        if (quantity>=1){
            return true;
        }else return false;
    }


    void borrowBook(){
        quantity+=1;
    }
    void returnBook(){
        quantity-=1;
    }
    void getBookDetails(){
        System.out.println("Book ID: "+id+ ", Author: "+author+ ", Title: "+title);

    }

    public String toString(){
        return "Book ID: "+id+ ", Author: "+author+ ", Title: "+title;
    }

}
