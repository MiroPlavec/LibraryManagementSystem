package products;

public class Book {

    private String name;
    private String author;
    private String category;
    private short bookPages;
    private boolean isBorrowed;

    public Book(String name, String author, String category, short bookPages) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.bookPages = bookPages;
        isBorrowed = false;
    }

}
