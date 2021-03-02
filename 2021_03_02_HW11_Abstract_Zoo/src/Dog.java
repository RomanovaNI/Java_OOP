public class Dog extends Animal {

    public Dog(String name, int yearOfBirth, String gender, String color) {
        super(name, yearOfBirth, gender, color);
    }

    @Override
    void makesSound() {
        System.out.println("bao wow");

    }

    @Override
    void drinks() {


    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
