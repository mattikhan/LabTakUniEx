/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtaskuniex;

import java.util.Iterator;

/**
 *
 * @author sp21-bse-030
 */
public class EmployeeController {
    private Director director;
    private University university;

    public EmployeeController(Director director, University university) {
        this.director = director;
        this.university = university;
    }

    public void generateOrganogram() {
        director.print();
    }

    public void activateBonus(String bonusType, int percentageOfBonus) {
        applyBonus(director, percentageOfBonus);
        university.notifyUpdate("Bonus of " + percentageOfBonus + "% applied as " + bonusType);
    }

    private void applyBonus(IEmployee employee, int percentageOfBonus) {
        employee.giveBonus(percentageOfBonus);
        if (employee instanceof Director || employee instanceof HOD) {
            Iterator<IEmployee> iterator = ((Director) employee).createIterator();
            while (iterator.hasNext()) {
                applyBonus(iterator.next(), percentageOfBonus);
            }
        }
    }
}
