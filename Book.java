package ConsulnetLibrary;

import java.util.ArrayList;

public class Book {

    int id;
    String title;
    String author;
    int quantity;

    public Book(int id, String author, String title, int quantity){
        this.id = id;
        this.author = author;
        this.title = title;
        this.quantity = quantity;
    }

    boolean isAvailable(){
        return quantity >= 1;
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
