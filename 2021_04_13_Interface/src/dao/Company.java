package dao;

import interfaces.ICompany;
import model.BonusWorker;
import model.Employee;

public class Company implements ICompany {
    public static void main(String[] args) {

    }

    private Employee[] employees;
    private int size;


    public Company(int capacity) {
        if (capacity <= 0) {
            employees = new Employee[20];
        } else {
            employees = new Employee[capacity];
        }
        size = 0;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        if (size == employees.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (employee.equals(employees[i])) {
                return false;
            }
        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size - 1; i++) {
            if (id == employees[i].getId()) {
                Employee temp = employees[i];
                employees[i] = employees[i + 1];
                return temp;
            }
            employees[size - 1] = null;
            size--;
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += employees[i].getSalary();
        }
        return result;
    }

    @Override
    public double avgSalary() {

        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double result = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof BonusWorker) {
                result += ((BonusWorker) employees[i]).getSales();
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCompany() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        return null;
    }

}
