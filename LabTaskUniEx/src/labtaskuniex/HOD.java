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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HOD extends BaseEmployee {
    private List<IEmployee> subordinates = new ArrayList<>();
    private String departmentName;

    public HOD(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    @Override
    public void add(IEmployee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(IEmployee employee) {
        subordinates.remove(employee);
    }

    @Override
    public IEmployee getChild(int i) {
        return subordinates.get(i);
    }

    public Iterator<IEmployee> createIterator() {
        return subordinates.iterator();
    }

    @Override
    public void print() {
        System.out.println("HOD: " + getName() + ", Salary: " + getSalary() + ", Department: " + departmentName);
        Iterator<IEmployee> iterator = createIterator();
        while (iterator.hasNext()) {
            IEmployee employee = iterator.next();
            employee.print();
        }
    }
}

