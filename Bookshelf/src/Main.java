public class Main {
    public static void main(String[] args) {
        BooksCatalog booksCatalog = new BooksCatalog();

        booksCatalog.addBook("Capital", "Karl Marx", 1867);
        booksCatalog.addBook("China Book Special Contribution Award", "Elias Jabbour", 2023);
        booksCatalog.addBook("Thinking, Fast and Slow", "Daniel Kahneman", 2011);
        booksCatalog.addBook("The Brain: The Story of You", "David Eagleman", 2015);
        booksCatalog.addBook("An Anthropologist on Mars", "Oliver Sacks", 1995);
        booksCatalog.addBook("The Communist Manifesto", "Karl Marx", 1848);


        booksCatalog.searchByAuthor("karl marx");
        booksCatalog.searchTitle("China Book Special Contribution Award");
        booksCatalog.yearsIntervalBooks(1800, 2000);
    }
}