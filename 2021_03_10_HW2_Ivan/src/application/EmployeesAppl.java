package application;

import data.Employee;
import data.Manager;
import data.SalesMan;
import data.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Sokolov", 0000001, 45, "MTS", 4450.50, 3);
        Manager manager2 = new Manager("Petrov", 0000002, 35, "MTS", 4950.77, 4);
        WageEmployee worker1 = new WageEmployee("Sidorov", 0000003, 24, "Tele2", 0.0, 40, 14.59);
        WageEmployee worker2 = new WageEmployee("Ivanov", 0000004, 54, "Tele2", 0.0, 22, 14.59);
        SalesMan seller1 = new SalesMan("Fedorova", 0000001, 33, "Megafon", 1455.76, 55.9, 27);
        SalesMan seller2 = new SalesMan("Bragina", 0000002, 43, "Megafon", 1455.76, 15.33, 27);
        Employee [] emps= {manager1,manager2, worker1,worker2,seller1,seller2};
        printAllEmployees(emps);
    }

    private static void printAllEmployees(Employee [] input) {
        for (Employee emp:input) {
            System.out.println(emp);

        }
    }
}
