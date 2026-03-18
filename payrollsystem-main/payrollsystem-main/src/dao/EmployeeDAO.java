package dao;

import db.DBConnection;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO employee(name, department, salary) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();

            System.out.println("Employee Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}