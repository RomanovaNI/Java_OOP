package data;

public class Manager extends Employee{
    int grade;

    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
        super(name, id, age, company, baseSalary);
       setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>=1&&grade<=4)
        this.grade = grade;
        else
            System.out.println("Incorrect grade");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                '}';
    }
}
