import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        library = new Library("Edinburgh Library");
        book = new Book("Harry Potter", "JK Rowling", "Magic");
        book2 = new Book("Harry Potter 2", "JK Rowling", "Magic");
        book3 = new Book("Harry Potter 3", "JK Rowling", "Magic");
        book4 = new Book("Harry Potter 4", "JK Rowling", "Magic");
    }

    @Test
    public void LibraryHasName() {
        assertEquals("Edinburgh Library", library.getName());
    }

    @Test
    public void libraryHasStockList() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToStock() {
        library.addBookToStock(book);
        library.addBookToStock(book2);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void cantAddBookIfCapacityFull() {
        library.addBookToStock(book);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        assertEquals(3, library.stockCount());
    }






}
