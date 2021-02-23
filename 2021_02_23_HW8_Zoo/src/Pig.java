public class Pig extends Animal {
    private double weight;


    public Pig(String name, String breed, int yearOfBirth, String gender, boolean predotor, double weight) {
        super(name, breed, yearOfBirth, gender, predotor);
        this.weight = weight;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("I m eating 24/7");
    }

    @Override
    void drinks() {
        super.drinks();
        System.out.println("my drink is over");
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("oink oink");
    }

    @Override
    void moves() {
        super.moves();
        System.out.println("Jumping");
    }

    public String toString() {
        return "Pig " + super.toString() + " " + "my lovely weight " + weight;
    }

}

