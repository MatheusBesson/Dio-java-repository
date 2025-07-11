
public class Book {
private    String title;
private    String author;
private    int year;

    public Book(String title, String author, int year) {
        this.year = year;
        this.author = author;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{========== \n" +
                "title='" + title + "\n" +
                ", author='" + author + "\n" +
                ", year=" + year + "\n" +
                "========== }";
    }
}
