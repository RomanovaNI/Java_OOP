package exercise;

public class TestSolution {
    public static void main(String[] args) {
        Solution soll = new Solution();


        soll.firstHalf("WooHoo");
        if (soll.firstHalf("WooHoo").equals("Woo")) {
            System.out.println("Its working");

        } else {
            System.out.println("Mistake");
        }


        soll.nonStart("hello", "there");
    }
}
