
public class BooksAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1234567, "Tolstoi", "War and Piece", 572, 2.6);
        Book book2 = new Book(654321, "Turgenev", "Asya", 122, 1.3);
        Book book3 = new Book(7777777, "Tutchev", "    ", 15, 3.3);
        Book book4 = new Book(1111111, "Pushkin", "Evgenyi Onegin", 102, 10.6);
        Book book5 = new Book(3333333, "", "Vyi", 272, 5.5);
        Book book6 = new Book(1234567, "Dostoevskyi", "Idiot", -72, 6.1);
      /*  System.out.println(book1);
        System.out.println("=========");
        System.out.println(book2);
        System.out.println("=========");
        System.out.println(book3);
        System.out.println("=========");
        System.out.println(book4);
        System.out.println("=========");
        System.out.println(book5);
        System.out.println("=========");
        System.out.println(book6);*/
        Book[] shelf1 = new Book[]{book1, book2, book3, book4, book5, book6};
        // printBooks(shelf1);
        System.out.println("Price for the books when it has corect pages and price per page is " + getTotalPrice(shelf1) + " rub");
    }

    private static double getTotalPrice(Book[] books) {

        double result = 0.0;
        //  double priceBook=books[]
        for (int i = 0; i < books.length; i++) {
            result = result + books[i].getPages() * books[i].getPricePerPage();


        }
        return result;
    }

    private static void printBooks(Book[] books) {
        System.out.println(" The shelf with the books:");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.println(books[i]);
        }
        System.out.println(books[books.length - 1]);
    }
}
