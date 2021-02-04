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
        Book book1 = new Book();
        book1.name = "Aзбука";
        book1.isbn = "546-375-47-2";
        book1.author = "Goretskyi";
        book1.publishedYear = 1995;
        book1.pages = 76;
        book1.cover = "hard";
        book1.genre = "fiction";
        book1.rating = 3.8;
        book1.priceEuro = 8.9;
        book1.bookInformation();

        Book book2 = new Book();
        book2.name = "Bойна и Mир";
        book2.isbn = "54-47-2";
        book2.author = "Tolstoi";
        book2.publishedYear = 2014;
        book2.pages = 674;
        book2.cover = "hard";
        book2.genre = "epic novel";
        book2.rating = 4.3;
        book2.priceEuro = 21.2;
        book2.bookInformation();

        Book book3 = new Book();
        book3.name = "Kнига о вкусной и полезной пище";
        book3.isbn = "49-5-84-7-2";
        book3.author = "Ivanova";
        book3.publishedYear = 2020;
        book3.pages = 55;
        book3.cover = "soft";
        book3.genre = "not found";
        book3.rating = 2.3;
        book3.priceEuro = 5.2;
        book3.bookInformation();

        Book book4 = new Book();
        book4.name = "The power of now";
        book4.isbn = "49767-2";
        book4.author = "Eckhart Tolle";
        book4.publishedYear = 2000;
        book4.pages = 225;
        book4.cover = "soft";
        book4.genre = "spirituality";
        book4.rating = 2.3;
        book4.priceEuro = 13.2;
        book4.bookInformation();

        Book book5 = new Book();
        book5.name = "Glück";
        book5.isbn = "674-767-2";
        book5.author = "M. Ricard";
        book5.publishedYear = 2010;
        book5.pages = 325;
        book5.cover = "soft";
        book5.genre = "novel";
        book5.rating = 5.0;
        book5.priceEuro = 10.9;
        book5.bookInformation();
    }
}
