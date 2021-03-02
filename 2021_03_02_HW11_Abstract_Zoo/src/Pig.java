public class Pig extends Animal {

    public Pig(String name, int yearOfBirth, String gender, String color) {
        super(name, yearOfBirth, gender, color);
    }

    @Override
    void makesSound() {
        System.out.println("ionk ionk");

    }

    @Override
    void drinks() {
        System.out.println("everything what is liquid i drink");

    }

    @Override
    public String toString() {
        return "Pig " + super.toString();
    }
}
