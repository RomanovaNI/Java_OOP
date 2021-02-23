public class Cat extends Animal {
    private String placeToSleep;

    public Cat(String name, String breed, int yearOfBirth, String gender, boolean predotor, String placeToSleep) {
        super(name, breed, yearOfBirth, gender, predotor);
        this.placeToSleep = placeToSleep;
    }

    @Override
    void eats() {
        super.eats();
    }

    @Override
    void drinks() {
        super.drinks();
        System.out.println("i prefer milk to water");
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("mio mio");
    }

    @Override
    void moves() {
        super.moves();

    }

    public String toString() {
        return "Cat " + super.toString() + " " + "my sleeping place is " + placeToSleep;
    }
}
