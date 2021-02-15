package homework04.data;

public class Book {
    public String name;
    public String author;
    public int publishedYear;
    public int pages;
    static int bookCount = 1;
    public int bookNumber;

    public Book() {
        bookNumber = bookCount;
        bookCount++;
    }

    public Book(String name, String author, int publishedYear, int pages) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.pages = pages;
        bookNumber = bookCount;
        bookCount++;

    }

    public String toDisplay() {
        return "Book info {" + "\n"
                + "Name: " + name + "\n"
                + "Author: " + author + "\n"
                + "Published year: " + publishedYear + "\n"
                + "Pages: " + pages + "\n"
                + "Book number: " + bookNumber + "}";
    }


}
