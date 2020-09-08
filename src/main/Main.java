/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 08-Sep-20
 *  Time: 4:14 PM
 */
package main;

import derived.Derived;

public class Main {
    public static void main(String[] args) {
        Derived object = new Derived();
        //we are going to access all the functions
        //calling functions of base class
        object.display();
        object.print();
        //function from derived class
        object.greet();
        //which type of inheritance is this?
    }
}
