public class Dog extends Animal {
    boolean childFriendly;


    public Dog(String name, String breed, int yearOfBirth, String gender, boolean predotor, boolean childFriendly) {
        super(name, breed, yearOfBirth, gender, predotor);
        this.childFriendly = childFriendly;
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("my best food is bones");
    }

    @Override
    void makesSound() {
        super.makesSound();
        System.out.println("gav gav");
    }

    @Override
    void moves() {
        super.moves();
    }

    public String toString() {
        return "Dog " + super.toString() + " " + "childfriendly " + childFriendly;
    }
}
