package org.example.dtos;

import org.example.domain.entities.Employee;

public class EmployeeDto {
    private int id;
    private String name;
    private String department;
    private String designation;
    private double salary;
public EmployeeDto(){

}
    public EmployeeDto(Employee employee) {
        this.id=employee.getId();
        this.name=employee.getName();
        this.department=employee.getDepartment();
        this.salary= employee.getSalary();
        this.designation=employee.getDesignation();

    }

    public EmployeeDto(int id, String name, String department, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
public  Employee GetEmployee(){
        return  new Employee(this.id,this.name,this.department,this.designation,this.salary);
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
