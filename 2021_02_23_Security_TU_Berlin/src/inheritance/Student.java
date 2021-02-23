package inheritance;

public class Student extends Person {
    private double rating;
    private String faculty;

    public Student(String firstName, String secondName, String uniID, String gender, int age, String faculty) {
        super(firstName, secondName, uniID, gender, age);
        rating = 10.0;
        this.faculty = faculty;
    }

    public Student() {
        super();
    }

    @Override
    void eats() {
        super.eats();
        System.out.println("Dinner at 18.00");
    }


    void study() {
        //business logic
        System.out.println("I study!");
    }

    void paysStudy() {
        System.out.println("I paid for the study");
    }

    @Override
    void walks() {
        super.walks();
    }

    @Override
    public String toString() {
        return " { Student: " +
                "first name " + super.getFirstName() + " " +
                "second name " + super.getSecondName() + " " +
                "uniID " + super.getUniID() + " " +
                "rating " + rating + " " + "faculty " + faculty + "}";
    }
}
