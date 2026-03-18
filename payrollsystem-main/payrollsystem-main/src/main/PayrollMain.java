package main;

import dao.EmployeeDAO;
import model.Employee;

public class PayrollMain {

    public static void main(String[] args) {

        Employee emp = new Employee("Yuvaraj", "IT", 45000);

        EmployeeDAO dao = new EmployeeDAO();

        dao.addEmployee(emp);

        System.out.println("Payroll System Running");
    }
}