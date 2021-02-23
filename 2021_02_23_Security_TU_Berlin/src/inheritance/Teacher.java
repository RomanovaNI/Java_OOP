package inheritance;

public class Teacher extends Person {
    private double salary;


    public Teacher(String firstName, String secondName, String uniID, String gender, int age, double salary) {
        super(firstName, secondName, uniID, gender, age);
        this.salary = salary;
    }

    public Teacher() {
    }


    public Teacher(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        setSalary(500.0);

    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();

    }

    @Override
    void walks() {
        super.walks();
    }

    @Override
    void getsSalary() {
        super.getsSalary();
    }

    void teach() {
        System.out.println("If i learnt this, you can do also");
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString() +
                "salary " + salary;
    }

}
