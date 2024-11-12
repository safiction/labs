import java.util.ArrayList;

public class Library {
    private Book book;
    private ArrayList<Book> myBooks;

    public Library() {
        myBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null)
            myBooks.add(book);
    }


    public void displayBooks() {
        if (myBooks.isEmpty())
            System.out.println("No books in your library");
        else {
            System.out.println("----- Books in your library: -----");
            for (Book book : myBooks)
                System.out.println(book);
        }
    }
}
