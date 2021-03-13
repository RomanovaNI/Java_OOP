package data;

import java.util.Objects;

public abstract class Employee extends Person {
    String company;
    double baseSalary;

    public Employee() {
        //   name="no name";
        this.company = "Not defined";
    }

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        if (company != null)
            this.company = company;
        else
            this.company = "Not defined";
        setBaseSalary(baseSalary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null)
            this.company = company;
        else
            System.out.println("Wrong company");
    }

    public double getBaseSalary() {

        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            System.out.println("wrong baseSalary");
        } else {
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

    public abstract double calcSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSalary, baseSalary) == 0 &&
                Objects.equals(company, employee.company);
    }


}
