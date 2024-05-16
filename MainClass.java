package com.Ajmayen.EmployeeManagement;

public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee(130,"Ajmayen",120,12);
        emp.Employee_info(emp);
        CalculateSalary cal = new CalculateSalary();
        cal.Monthly_Salary();
        cal.Yearly_Salary();
    }
}
