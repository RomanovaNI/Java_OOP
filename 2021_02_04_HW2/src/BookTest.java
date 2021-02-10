import java.util.Arrays;

public class BooksUpdateTest {
    public static void main(String[] args) {
        shelf1();
        shelf2();
        // shelf3();
        shelf4();
        BooksUpdate book1 = new BooksUpdate("It", "S.King", 1983, 352);
        BooksUpdate book2 = new BooksUpdate("Think and grow rich", "N.Hill", 2010, 276);
        BooksUpdate book3 = new BooksUpdate("The stand", "S.King", 2015, 622);
        BooksUpdate book4 = new BooksUpdate("Trainspotting", "I.Welsh", 1996, 152);
        BooksUpdate[] shelf3 = new BooksUpdate[]{book1, book2, book3, book4};
        // System.out.println(Arrays.toString(shelf3));
        sortByYear(shelf3);
        //System.out.println(Arrays.toString(shelf3)); WHYYYYY

    }

    private static void sortByYear(BooksUpdate[] shelf) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < shelf.length - 1; i++) {
                if (shelf[i].publishedYear > shelf[i + 1].publishedYear) {
                    int temp = shelf[i].publishedYear;
                    shelf[i].publishedYear = shelf[i + 1].publishedYear;
                    shelf[i + 1].publishedYear = temp;
                    count++;
                }
            }
        }
        while (count > 0);

        System.out.print("[");
        for (int i = 0; i < shelf.length - 1; i++) {
            System.out.print(shelf[i].publishedYear + ", ");
        }
        System.out.println(shelf[shelf.length - 1].publishedYear + "]");

    }


    private static void shelf4() {
        BooksUpdate book1 = new BooksUpdate("Bukowski", "novel", 2.2, 7.2);
        BooksUpdate book5 = new BooksUpdate("Grinov", "scince", 4.4, 15.1);
        BooksUpdate book3 = new BooksUpdate("Nabokov", "novel", 3.9, 10.0);
        BooksUpdate book4 = new BooksUpdate("Grimm", "fantasy", 5.0, 7.6);
    }

/*  //  private static void shelf3() {
        BooksUpdate book1 = new BooksUpdate("It", "S.King", 1983, 352);
        BooksUpdate book2 = new BooksUpdate("Think and grow rich", "N.Hill", 2010, 276);
        BooksUpdate book3 = new BooksUpdate("The stand", "S.King", 2015, 622);
        BooksUpdate book4 = new BooksUpdate("Trainspotting", "I.Welsh", 1996, 152);

        BooksUpdate[] shelf3 = new BooksUpdate[]{book1, book2, book3, book4};
 //       System.out.println(book2.publishedYear);

    }*/


    private static void shelf2() {
        BooksUpdate book1 = new BooksUpdate("Glück", 325, "soft");
        BooksUpdate book2 = new BooksUpdate("Try and Cry", 125, "soft");
        BooksUpdate book3 = new BooksUpdate("Running wolves", 257, "soft");
    }

    private static void shelf1() {
        BooksUpdate book1 = new BooksUpdate("Azbuka", "A.Pogorelov");
        BooksUpdate book2 = new BooksUpdate("Bойна и Mир", "L.Tolstoi");
        BooksUpdate book3 = new BooksUpdate("Kнига о вкусной и полезной пище", "L.Ivanova");
        BooksUpdate book4 = new BooksUpdate("The power of now", "E.Tolle");

    }
}
