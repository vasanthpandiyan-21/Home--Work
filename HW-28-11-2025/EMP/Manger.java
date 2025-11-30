/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMP;

/**
 *
 * @author Hp
 */



class Manager extends Employee
{
    Manager(String name) {
        super(name);
    }

    void showRole() 
    {
        System.out.println(name + " is a Manager");
    }
}
