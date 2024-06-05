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
public class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, double salary, String rank) {
        super(name, salary);
        this.rank = rank;
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
        System.out.println("DOO: " + getName() + ", Salary: " + getSalary() + ", Rank: " + rank);
    }
}

