public class Book {
    private long isbn;
    private String author;
    private String title;
    private int pages;
    private double pricePerPage;

    public Book(long isbn, String author, String title, int pages, double pricePerPage) {
        if (isbn > 99_999 && isbn < 1000_000)
            this.isbn = isbn;

        if (author == null || author.trim().isEmpty()) {
            this.author = "No author info";
        } else {
            this.author = author;
        }
        if (title == null || title.trim().isEmpty()) {
            this.title = "No title book info";
        } else {
            this.title = title;
        }
        if (pages <= 0 || pages >= 10_000) {
            System.out.println("No info how many pages in the book ");
        } else {
            this.pages = pages;
        }
        setPricePerPage(pricePerPage);
    }

    public Book() {
        author="no author";
        title="no title";
    }

    public long getIsbn() {
        return isbn;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            this.author = "wrong author";
        } else {
            this.author = author;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            this.title = "wrong title";
        } else {
            this.title = title;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0 || pages >= 10_000) {
            System.out.println("No info how many pages in the book ");
        } else {
            this.pages = pages;
        }
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0.0 && pricePerPage <10.0) {
            this.pricePerPage = pricePerPage;
            System.out.println("No price info");
        } else {
            System.out.println("No price info");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}
