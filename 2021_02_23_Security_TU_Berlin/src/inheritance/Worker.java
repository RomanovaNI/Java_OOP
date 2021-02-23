package inheritance;

public class Worker extends Person {
    private boolean workSatisfaction;

    public Worker(String firstName, String secondName, String uniID, String gender, int age, boolean workSatisfaction) {
        super(firstName, secondName, uniID, gender, age);
        this.workSatisfaction = workSatisfaction;
    }

    public Worker(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);

    }

    @Override
    void walks() {
        super.walks();
    }

    @Override
    void getsSalary() {
        super.getsSalary();
    }

    @Override
    void eats() {
        System.out.println("earn the food");
    }

    void works() {
        System.out.println("otsuda i do  zari!");
    }

    @Override
    public String toString() {
        return "Worker: " + super.toString() + " " +
                "workSatisfaction " + workSatisfaction;
    }
}
