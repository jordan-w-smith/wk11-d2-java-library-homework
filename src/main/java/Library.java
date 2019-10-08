import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name) {
        this.name = name;
        this.stock = new ArrayList<Book>();
        this.capacity = 3;
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        if (stockCount() < this.capacity) {
            this.stock.add(book);
        }

    }
}
