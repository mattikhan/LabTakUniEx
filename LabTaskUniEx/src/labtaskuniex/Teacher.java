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
public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, double salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
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
        System.out.println("Teacher: " + getName() + ", Salary: " + getSalary() + ", Qualification: " + qualification + ", Status: " + status);
    }
}

