package application;

import data.Employee;
import data.Manager;
import data.SalesMan;
import data.WageEmployee;

public abstract class EmployeesAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Sokolov", 0000001, 45, "MTS", 4450.50, 3);
        Manager manager2 = new Manager("Petrov", 0000002, 35, "MTS", 4950.77, 4);
        Manager manager3 = new Manager("Kozlova", 0000003, 41, "MTS", 3950.77, 2);
        WageEmployee worker1 = new WageEmployee("Sidorov", 0000004, 24, "MTS", 0.0, 40, 14.59);
        WageEmployee worker2 = new WageEmployee("Ivanov", 0000005, 54, "MTS", 0.0, 52, 14.59);
        WageEmployee worker3 = new WageEmployee("Orlova", 0000006, 37, "MTS", 0.0, 82, 14.59);
        SalesMan seller1 = new SalesMan("Fedorova", 0000007, 33, "MTS", 1455.76, 45000.9, 3);
        SalesMan seller2 = new SalesMan("Bragina", 9, 43, "MTS", 1455.76, 12000.33, 3);
        SalesMan seller3 = new SalesMan("Shanin", 10, 35, "MTS", 1455.76, 27000.01, 3);
        Employee[] emps = {manager1, manager2, manager3, worker1, worker2, worker3, seller1, seller2, seller3};
        //  printAllEmployees(emps);
        double res = getSumSalaryAllEmployees(emps);
        System.out.printf("Total Salary All Employee Feb 2021 = %.2f euro", res);
        System.out.println();
        double salary = 3000.00;
        printEmpsWithSalaryMoreThan(emps, salary);
        System.out.println("Revenue of the company is " + getCompanyRevenue(emps) + "euro");
    }

    private static double getCompanyRevenue(Employee[] input) {
        double res = 0.0;
        for (Employee emp : input) {
            if (emp instanceof SalesMan) {
                res = res + ((SalesMan) emp).getTotalSales();
            }
        }
        return res;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] input, double salary) {
        for (Employee emp : input) {
            if (emp.calcSalary() > salary) {
                System.out.println(emp);
            }
        }
    }

    private static double getSumSalaryAllEmployees(Employee[] input) {
        double result = 0.0;
        for (Employee emp : input) {
            result = result + emp.calcSalary();
        }
        return result;
    }

    private static void printAllEmployees(Employee[] input) {
        for (Employee emp : input) {
            System.out.println(emp);
        }
    }
}
