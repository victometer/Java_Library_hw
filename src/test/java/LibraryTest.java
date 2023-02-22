import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library1;
    private Books book1;
    private Books book2;
    private Books book3;
    private ArrayList <Books> books;




    @Before
    public void before(){
        books = new ArrayList<Books>(
                Arrays.asList (book1, book2, book3));
        library1 = new Library(books, 5);
        book1 = new Books("something", "GH", "none");

    }

    @Test
    public void canCountBooks(){
        assertEquals(3, library1.getBookCount());
    }
    @Test
    public void canAddBook(){
        library1.addBook(book1);
        assertEquals(4, library1.getBookCount());
    }
    @Test
    public void hasCapacity(){
        assertEquals(5, library1.getCapacity());
    }
    @Test
    public void canCheckIfStockFull(){
//        library1.addBook(book1);
//        library1.addBook(book1);
        assertEquals("You can add a book", library1.checkIfStockFull());
    }
    @Test
    public void canRemoveBook(){
        library1.addBook(book1);
        Books book = library1.removeBook();
        assertEquals(3, library1.getBookCount());
        assertEquals(Books.class, book.getClass());
    }
}
