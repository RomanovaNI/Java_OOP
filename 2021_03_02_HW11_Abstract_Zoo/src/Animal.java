abstract class Animal {
    public String name;
    public int yearOfBirth;
    public String gender;
    public String color;

    public Animal(String name, int yearOfBirth, String gender, String color) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.color = color;
    }

    abstract void makesSound();

    abstract void drinks();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
