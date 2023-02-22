import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class BooksTest {
    private Books book1;

    @Before
    public void before(){
        book1 = new Books("Harry Potter", "JK Rowling", "fantasy");

    }

    @Test
    public void hasTitle(){
        assertEquals("Harry Potter", book1.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("JK Rowling", book1.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("fantasy", book1.getGenre());
    }
}
