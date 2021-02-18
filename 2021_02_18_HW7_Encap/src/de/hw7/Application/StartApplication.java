package de.hw7.Application;

import de.hw7.data.Book;

import java.util.Arrays;

public class StartApplication {
    public static void main(String[] args) {
        Book book1 = new Book("Buratino", "Tolstoi", true, 3.8, 45);
        Book book2 = new Book("Robin Hood", "Duma", true, 4.8, 432);
        Book book3 = new Book("Cinderella", "Perrault", true, 1.8, 33);
        Book book4 = new Book("Kolobok", "Folk", false, 2.5, 14);
        System.out.println("Test before changes " + book1.getName() + " " +
                book1.getAuthor() + " " + book1.getPages() + " " + book1.getRating());
        book1.setName("Pinoccio");
        book1.setRating(2.0);
        System.out.println("Test after changes " + book1.getName() + " " +
                book1.getAuthor() + " " + book1.getPages() + " " + book1.getRating());

        Book[] babyShelf = new Book[]{book1, book2, book3, book4};

        cocktailSort(babyShelf);
        printArray(cocktailSort(babyShelf));

    }


    public static Book[] cocktailSort(Book[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (array[i].getPages() > array[i + 1].getPages()) {
                    Book temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    swap = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i].getPages() < array[i - 1].getPages()) {
                    Book temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
return array;
    }

    public static void printArray(Book[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getPages() + ", ");
        }

    }
}




