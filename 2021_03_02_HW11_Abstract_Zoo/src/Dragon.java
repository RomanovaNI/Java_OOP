public class Dragon extends Animal {
    public Dragon(String name, int yearOfBirth, String gender, String color) {
        super(name, yearOfBirth, gender, color);
    }

    @Override
    void makesSound() {
        System.out.println("I make no sound, i make fire");

    }

    @Override
    void drinks() {
        System.out.println("blood is a nice drink");
    }

    @Override
    public String toString() {
        return "Dragon " +
                super.toString();
    }
}
