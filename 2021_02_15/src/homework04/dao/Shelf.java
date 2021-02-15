package homework04.dao;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import homework04.data.Book;

public class Shelf {
    public Book[] books;
    public int size;

    public Shelf(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean putAwayBook(Book bookAway) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(bookAway)) {
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return true;
            }

        }
        return false;

    }


    //Can we make bubble sort in this class?
    public Book[] sortByYear(Book[] books) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].publishedYear > books[i + 1].publishedYear) {
                    int temp = books[i].publishedYear;
                    books[i].publishedYear = books[i + 1].publishedYear;
                    books[i + 1].publishedYear = temp;
                    unsorted = true;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].publishedYear + ", ");
        }
        System.out.println(books[books.length - 1].publishedYear + "]");
        return books;

    }

}
