/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2018inheritanceexample;

/**
 *
 * @author moxdroid
 */
public class Employee extends Person
{
    private String deptName; //Account, HR, Software Development, QA, etc;
    private double salary;
    private String managerName;
    private String designation; //Manager, Programmer, etc.

    public Employee() {
        super();
    }
    
      public Employee(int id, String name, char gender) {
        super(id, name, gender);
    }

    public Employee(String deptName, double salary, String managerName) {
        this.deptName = deptName;
        this.salary = salary;
        this.managerName = managerName;
    }

    public Employee(String deptName, double salary, String managerName, String designation, int id, String name, char gender) {
        super(id, name, gender);
        this.deptName = deptName;
        this.salary = salary;
        this.managerName = managerName;
        this.designation = designation;
    }

    
    
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Department Name: " + this.deptName);
        System.out.println("Designation: " + this.designation);
        System.out.println("Manager Name : " + this.managerName);
        System.out.println("Salary : " + this.salary);
    }
    
   
    @Override
    public void print() {
        System.out.println("I am print() method from Employee Class");
    }
    
    
    
}
