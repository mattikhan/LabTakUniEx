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
public abstract class BaseEmployee implements IEmployee, Observer {
    protected String name;
    protected double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void add(IEmployee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(IEmployee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IEmployee getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        this.salary += this.salary * bonusPercentage / 100;
    }

    @Override
    public void update(String message) {
        System.out.println(getName() + " received update: " + message);
    }
}

