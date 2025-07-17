package src;

import java.util.Comparator;

public class CompByPrice implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}
