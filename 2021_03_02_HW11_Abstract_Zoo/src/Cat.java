

public class Cat extends Animal{
    public Cat(String name, int yearOfBirth, String gender, String color) {
        super(name, yearOfBirth, gender, color);
    }

    @Override
    void makesSound() {
        System.out.println("Mao mao");

    }

    @Override
    void drinks() {
        System.out.println("i prefer milk to water");

    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
