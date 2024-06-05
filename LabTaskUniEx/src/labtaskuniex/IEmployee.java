/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtaskuniex;

/**
 *
 * @author sp21-bse-030
 */
public interface IEmployee {
    void add(IEmployee employee);
    void remove(IEmployee employee);
    IEmployee getChild(int i);
    String getName();
    double getSalary();
    void print();
    void giveBonus(int bonusPercentage);
}

