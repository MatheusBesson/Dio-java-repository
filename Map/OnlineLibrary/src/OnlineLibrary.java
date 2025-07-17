package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OnlineLibrary {
    Map<String, Book> bookMap;


    public OnlineLibrary() {
        this.bookMap = new HashMap<>();
    }

    public void addBook(String link, String title, String author, double price) {
        Book book = new Book(title, author, price);
        bookMap.put(link, book);
        System.out.println("The book was added to the map selection.");
    }

    public void removeBook(String title) {
        String trimTitle = title.trim();
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            String link = entry.getKey();
            Book book = entry.getValue();
            if (book.getTitle().equalsIgnoreCase(trimTitle)) {
                bookMap.remove(link);
                System.out.println("Book removed from the shelf.");
            }
        }
    }

    public Map<String, Book> booksByPrice() {
        List<Map.Entry<String, Book>> toOrderByPriceBooks = new ArrayList<>(bookMap.entrySet());
        Collections.sort(toOrderByPriceBooks, Comparator.comparingDouble(b -> b.getValue().getPrice()));

        /* Initial code

        public Map<String, Book> booksByPrice() {
        List<Map.Entry<String, Book>> toOrderByPriceBooks = new ArrayList<>(bookMap.entrySet());
        Collections.sort(toOrderByPriceBooks, new Comparator<Map.Entry<String, Book>>() {
            @Override
            public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
                return Double.compare(b1.getValue().getPrice(), b2.getValue().getPrice());
            }
        });

        // replacing with lambda (arrow function)
            public Map<String, Book> booksByPrice() {
                List<Map.Entry<String, Book>> toOrderByPriceBooks = new ArrayList<>(bookMap.entrySet());
                Collections.sort(toOrderByPriceBooks, (b1, b2) -> Double.compare(b1.getValue().getPrice(),
                b2.getValue().getPrice()));

        // replacing with Comparator.comparingDouble (LAST)
            public Map<String, Book> booksByPrice() {
                List<Map.Entry<String, Book>> toOrderByPriceBooks = new ArrayList<>(bookMap.entrySet());
                Collections.sort(toOrderByPriceBooks, Comparator.comparingDouble(b -> b.getValue().getPrice()));
        *  */

        Map<String, Book> booksByPrice = new LinkedHashMap<>();

        for (Map.Entry<String, Book> entry : toOrderByPriceBooks) {
            String link = entry.getKey();
            Book book = entry.getValue();
            booksByPrice.put(link, book);
        }
        return booksByPrice;
    }

    public Map<String, Book> BooksByAuthor() {
        List<Map.Entry<String, Book>> toOrderByAuthorBooks = new ArrayList<>(bookMap.entrySet());

        Collections.sort(toOrderByAuthorBooks, new Comparator<Map.Entry<String, Book>>() {
            @Override
            public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
                return 0;
            }
        });

    }


}