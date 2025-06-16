package ConsulnetLibrary;

import java.util.ArrayList;

public class Book {
    private static int count;
    int id;
    String title;
    String author;
    int quantity;

    public Book(String author, String title, int quantity){
        this.id = count;
        count++;
        this.author = author;
        this.title = title;
        this.quantity = quantity;
    }

    boolean isAvailable(){
        return quantity >= 1;
    }


    void getBookDetails(){
        System.out.println("Book ID: "+id+ ", Author: "+author+ ", Title: "+title);

    }

    public String toString(){
        return "Book ID: "+id+ ", Author: "+author+ ", Title: "+title+ ", Quantity: "+quantity;
    }

}
