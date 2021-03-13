package data;

import java.util.Objects;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee() {
    }

    public WageEmployee(String name, long id, int age, String company, double baseSalary, int hours, double wage) {
        super(name, id, age, company, baseSalary);
        setHours(hours);
        setWage(wage);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0)
            this.hours = hours;
        else
            System.out.println("Wrong hours");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0)
            this.wage = wage;
        else
            System.out.println("Wrong wage");
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public double calcSalary() {
        return hours * wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WageEmployee)) return false;
        if (!super.equals(o)) return false;
        WageEmployee that = (WageEmployee) o;
        return hours == that.hours &&
                Double.compare(that.wage, wage) == 0;
    }


}
