public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article("Sightseeing of Berlin",
                "Come, drink, fun");

        Article art2 = new Article("Sightseeing of Potsdam",
                "History and culture" );

        System.out.println(art1.title);
        System.out.println(art2.announce);

        Article art3 = new Article(13,
                "Important Article",
                "I build the monument..");
        System.out.println(art3.title);
    }


}
