/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Sep-20
 *  Time: 4:32 PM
 */
package ac.gla.main;

import ac.gla.derived.Employee;
import ac.gla.derived.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ravi");
        System.out.println("name of Student = " + student.getName());

        Employee employee = new Employee();
        employee.setName("Ramesh");
        System.out.println("name of employee = " + employee.getName());
        //which type of inheritance is this?

    }
}
