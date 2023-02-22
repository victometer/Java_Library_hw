import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower1;
    private Library library1;
    private Books book1;
    private Books book2;
    private Books book3;
    private ArrayList<Books> books;

    @Before
    public void before(){
        borrower1 = new Borrower();
        books = new ArrayList<>(
                Arrays.asList (book1, book2, book3));
        library1 = new Library(books, 5);
        book1 = new Books("MD", "HG", "none");

    }
    @Test
    public void canAddBookToCollection(){
        borrower1.addBorrowerBook(book1);
        assertEquals(1, borrower1.getBorrowerBookCount());
    }
    @Test
    public void canPickUpBookFromLibrary(){
        library1.addBook(book1);
        borrower1.pickUpBookFromLibrary(library1);
        assertEquals(1, borrower1.getBorrowerBookCount());
        assertEquals(2, library1.getBookCount());
    }
}
