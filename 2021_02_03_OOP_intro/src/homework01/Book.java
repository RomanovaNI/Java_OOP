package homework01;

public class Book {
    /*   Создать класс книги: название, isbn, автор, год издания, количество страниц,
       переплёт, жанр, рейтинг, цена(, возможно параметры, которые придумаете сами).
       Создать 5 экземпляров этого класса: азбука, война и мир, книга о вкусной и полезной пище,
       и два своих примера. Использовать в названиях переменных осмысленный английский язык.*/
    String name;
    String isbn;
    String author;
    int publishedYear;
    int pages;
    String cover;
    String genre;
    double rating;
    double priceEuro;

    public void bookInformation() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.println("You have " + ANSI_YELLOW_BACKGROUND + name + ANSI_RESET + " by " + author + " chosen");
        System.out.println("Main characteristics of " + ANSI_YELLOW_BACKGROUND + name + ANSI_RESET + ":");
        System.out.println("1. " + pages + " pages");
        System.out.println("2. " + publishedYear + " published");
        System.out.println("3. " + cover + " cover");
        System.out.println("4. Genre: " + genre);
        System.out.println("5. Rating in Amazon: " + rating);
        System.out.println("6. " + ANSI_GREEN + "Price" + ANSI_RESET + "/ISBN: "
                + ANSI_GREEN + priceEuro + ANSI_RESET + " euro/" + isbn);
        System.out.println("=============");
    }
}

class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Aзбука";
        book.isbn = "546-375-47-2";
        book.author = "Goretskyi";
        book.publishedYear = 1995;
        book.pages = 76;
        book.cover = "hard";
        book.genre = "fiction";
        book.rating = 3.8;
        book.priceEuro = 8.9;
        book.bookInformation();

        book.name = "Bойна и Mир";
        book.isbn = "54-47-2";
        book.author = "Tolstoi";
        book.publishedYear = 2014;
        book.pages = 674;
        book.cover = "hard";
        book.genre = "epic novel";
        book.rating = 4.3;
        book.priceEuro = 21.2;
        book.bookInformation();

        book.name = "Kнига о вкусной и полезной пище";
        book.isbn = "49-5-84-7-2";
        book.author = "Ivanova";
        book.publishedYear = 2020;
        book.pages = 55;
        book.cover = "soft";
        book.genre = "not found";
        book.rating = 2.3;
        book.priceEuro = 5.2;
        book.bookInformation();

        book.name = "The power of now";
        book.isbn = "49767-2";
        book.author = "Eckhart Tolle";
        book.publishedYear = 2000;
        book.pages = 225;
        book.cover = "soft";
        book.genre = "spirituality";
        book.rating = 2.3;
        book.priceEuro = 13.2;
        book.bookInformation();

        book.name = "Glück";
        book.isbn = "674-767-2";
        book.author = "M. Ricard";
        book.publishedYear = 2010;
        book.pages = 325;
        book.cover = "soft";
        book.genre = "novel";
        book.rating = 5.0;
        book.priceEuro = 10.9;
        book.bookInformation();
    }
}
