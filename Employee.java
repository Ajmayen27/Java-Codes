package com.Ajmayen.EmployeeManagement;

public class Employee {


    static   int id;
    private String name;
    static double working_hour;
    static double payment_perhour;


    public Employee() {
    }

    public Employee(int id, String name, double working_hour, double payment_perhour) {
        this.id = id;
        this.name = name;
        this.working_hour = working_hour;
        this.payment_perhour = payment_perhour;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorking_hour() {
        return working_hour;
    }

    public void setWorking_hour(double working_hour) {
        this.working_hour = working_hour;
    }

    public double getPayment_perhour() {
        return payment_perhour;
    }

    public void setPayment_perhour(double payment_perhour) {
        this.payment_perhour = payment_perhour;
    }
    public void Employee_info(Employee employee) {
        System.out.println("Employee Info : ");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Working Hour: " + employee.getWorking_hour());
        System.out.println("Employee Payment PerHour: " + employee.getPayment_perhour());
        System.out.println();


    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' + '}';
    }
}
