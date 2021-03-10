package data;

public class Employee extends Person {
    String company;
    double baseSalary;

    public Employee() {
        //   name="no name";
        company = "no info";
    }

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        this.company = company;
       setBaseSalary(baseSalary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSalary() {

        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<=0){
            System.out.println("wrong charge");
        } else{
            this.baseSalary = baseSalary;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
