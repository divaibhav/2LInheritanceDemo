/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Sep-20
 *  Time: 4:27 PM
 */
package ac.gla.derived;

import ac.gla.base.Person;



public class Student extends Person {
    //now we will declare specific functionality of student
    int rollNo;
    double cpi;
    String course;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
