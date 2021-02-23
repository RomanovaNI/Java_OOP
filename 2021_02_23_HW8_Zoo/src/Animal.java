public class Animal {
    private String name;
    private String breed;
    private int yearOfBirth;
    private String gender;
    private boolean predotor;

    public Animal(String name, String breed, int yearOfBirth, String gender, boolean predotor) {
        this.name = name;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.predotor = predotor;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public boolean isPredotor() {
        return predotor;
    }

    void eats() {
        System.out.println("I am eating");
    }

    void drinks() {
        System.out.println("I am drinking");
    }

    void makesSound() {
        System.out.println("When i am happy, i make sound");
    }

    void moves() {
        System.out.println("Wohoo move is the life");
    }

    @Override
    public String toString() {
        return "Animal " +
                "name " + name + " " +
                ", breed " + breed + " " +
                ", yearOfBirth " + yearOfBirth + " " +
                ", gender " + gender + " " +
                ", predotor " + predotor + ", ";
    }
}
