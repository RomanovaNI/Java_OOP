package data;

import java.util.Objects;

public class SalesMan extends Employee {
    double totalSales;
    int bonuse;

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonuse) {
        super(name, id, age, company, baseSalary);
        setTotalSales(totalSales);
        setBonuse(bonuse);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales > 0)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong totalSales");
    }

    public int getBonuse() {
        return bonuse;
    }

    public void setBonuse(int bonuse) {
        if (bonuse > 0)
            this.bonuse = bonuse;
        else
            System.out.println("Wrong bonuse");
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", totalSales=" + totalSales +
                ", bonuse=" + bonuse +
                '}';
    }

    @Override
    public double calcSalary() {
        return baseSalary + totalSales * (bonuse / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesMan)) return false;
        if (!super.equals(o)) return false;
        SalesMan salesMan = (SalesMan) o;
        return Double.compare(salesMan.totalSales, totalSales) == 0 &&
                bonuse == salesMan.bonuse;
    }


}
