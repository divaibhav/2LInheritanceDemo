/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Sep-20
 *  Time: 4:29 PM
 */
package ac.gla.derived;

import ac.gla.base.Person;

public class Employee extends Person {
    //declare specific fields for employee
    String panCard;
    int empId;
    double salary;
    String department;

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
