package homework04.Application;

import homework04.dao.Shelf;
import homework04.data.Book;

public class StartApplication {
    public static void main(String[] args) {
        Shelf childrenShelf = new Shelf(5);
        Book buratino = new Book("Buratino", "Tostoi", 2015, 125);
        Book robinHood = new Book("Robin Hood", "Duma", 2000, 243);
        childrenShelf.addBook(buratino);
        childrenShelf.addBook(robinHood);
        System.out.println(childrenShelf.size);
        Book cinderella = new Book("Cinderella", "Perrault", 2020, 70);
        childrenShelf.addBook(cinderella);
        Book kolobok = new Book("Kolobok", "Folk", 2010, 20);
        System.out.println("Result of adding book: " + childrenShelf.addBook(kolobok));
        System.out.println(childrenShelf.size);

        System.out.println("Put away book: " + childrenShelf.putAwayBook(robinHood));
        System.out.println(childrenShelf.size);
        System.out.println(childrenShelf.books[1].name);
        //System.out.println(robinHood.bookNumber);
        //     System.out.println(robinHood.toDisplay());


        Book[] babyShelf = new Book[]{buratino, robinHood, cinderella};
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < babyShelf.length - 1; i++) {
                if (babyShelf[i].publishedYear > babyShelf[i + 1].publishedYear) {
                    babyShelf[i].publishedYear = babyShelf[i].publishedYear + babyShelf[i + 1].publishedYear;
                    babyShelf[i + 1].publishedYear = babyShelf[i].publishedYear - babyShelf[i + 1].publishedYear;
                    babyShelf[i].publishedYear = babyShelf[i].publishedYear - babyShelf[i + 1].publishedYear;
                    unsorted = true;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < babyShelf.length - 1; i++) {
            System.out.print(babyShelf[i].publishedYear + ", ");
        }
        System.out.println(babyShelf[babyShelf.length - 1].publishedYear + "]");

    }
}

