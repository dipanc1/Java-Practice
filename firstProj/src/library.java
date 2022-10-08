import java.lang.reflect.Array;
import java.util.ArrayList;

class Libr{
    String[] availableBooks;
    int no_of_books;
    
    Libr(){
        availableBooks = new String[10];
        no_of_books = 0;
    }
    
    void addBook(String book){
        for (String books:availableBooks) {
            if(books == book){
                System.out.println("Book already exists");
                return;
            }
        }
        availableBooks[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " this book has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for (String book:availableBooks) {
            if (book == null){
                continue;
            }
            System.out.println("*"+ book);
        }
    }

    void issueBook (String book){
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] == book){
                System.out.println("****** "+ book + " has been issued!");
                availableBooks[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist!");
    }

    void returnBook(String book){
        addBook(book);
    }



}

public class library
{
    public static void main(String[] args) {
        Libr lib = new Libr();

        lib.addBook("Jatt di mashook");
        lib.addBook("Jatt di sass");
        lib.addBook("Jatt di gharwali");
        lib.addBook("Jatt di tatti");
        lib.addBook("Jatt di rann");

        lib.showAvailableBooks();

        lib.issueBook("Jatt di mashook");

        System.out.println("\n");

        lib.showAvailableBooks();

        System.out.println("\n");

        lib.returnBook("Jatt di mashook");

        System.out.println("\n");

        lib.showAvailableBooks();

    }
}
