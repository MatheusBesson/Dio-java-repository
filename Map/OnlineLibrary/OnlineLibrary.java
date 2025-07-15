import java.util.Collections;
import java.util.HashMap;
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

        Map<String, Book> booksByPrice = new TreeMap<>(bookMap);
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            String link = entry.getKey();
            ;
            Book book = entry.getValue();
            booksByPrice.put(link, book);
            break;
        }
        return booksByPrice;
    }


}