import java.util.HashMap;

class Book{
    String name;
    String author;
}
class Library{
    HashMap<String, String> book = new HashMap<>();
    HashMap<String, String> issuedBooks = new HashMap<>();
    public void addBook(String b, String author){
        book.put(b, author);
    }

    public void issueBook(String b, String i){
        if(book.containsKey(b)){
            book.remove(b);
            issuedBooks.put(b, i);
            System.out.println(issuedBooks);
        }
    }

    public void returnBook(String b,String a, String i){
        if(issuedBooks.containsKey(b)){
            issuedBooks.remove(b);
            book.put(b,a);
            System.out.println(book);
            System.out.println(issuedBooks);
        }
    }
}

public class library_management_system {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("Jatti", "Jatt");
        l.addBook("Sohni", "Raja");
        l.addBook("Suri", "Bhupinder");

        l.issueBook("Jatti", "dipan");

        l.returnBook("Jatti", "Jatt", "dipan");
    }
}
