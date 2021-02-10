public class BooksUpdate {
    String name;
    String isbn;
    String author;
    int publishedYear;
    int pages;
    String cover;
    String genre;
    double rating;
    double priceEuro;

    public BooksUpdate(String bookName, String bookAuthor) {
        name = bookName;
        author = bookAuthor;
    }

    public BooksUpdate(String name, int pages, String cover) {
        this.name = name;
        this.pages = pages;
        this.cover = cover;
    }

    public BooksUpdate(String name, String author, int publishedYear, int pages) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.pages = pages;
    }

    public BooksUpdate(String bookAuthor, String genre, double rating, double bookPrice) {
        author = bookAuthor;
        this.genre = genre;
        this.rating = rating;
        priceEuro = bookPrice;
    }

    public BooksUpdate(String name, String isbn, double priceEuro) {
        this.name = name;
        this.isbn = isbn;
        this.priceEuro = priceEuro;
    }
}
