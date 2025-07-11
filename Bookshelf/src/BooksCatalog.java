
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    List<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        bookList.add(book);
        System.out.println("Book added to book's list.");
    }

    public ArrayList<Book> searchByAuthor(String author) {
        String trimAuthor = author.trim();
        ArrayList<Book> authorBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equalsIgnoreCase(trimAuthor)) {
                authorBooks.add(bookList.get(i));
                System.out.println("Book added.");
            }
        }
        if (authorBooks.isEmpty()) {
            System.out.println("Author not found.");
        }
        System.out.println(authorBooks);
        return authorBooks;
    }

    public ArrayList<Book> yearsIntervalBooks(int year1, int year2) {
        ArrayList<Book> intervalBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getYear() >= year1 && bookList.get(i).getYear() <= year2) {
                intervalBooks.add(bookList.get(i));
                System.out.println("Book added.");
            }
        }
        if (intervalBooks.isEmpty()) {
            System.out.println("Author not found.");
        }
        System.out.println(intervalBooks);
        return intervalBooks;
    }

    public void searchTitle(String title) {
        boolean flag = false;
        String trimTitle = title.trim();
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getTitle().equalsIgnoreCase(trimTitle)) {
                System.out.println("Book found.");
                System.out.println(bookList.get(i));
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Book not found.");
        }
        flag = false;
    }
}
