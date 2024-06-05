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
public class UniversityMain {
    public static void main(String[] args) {
        // Create individual employees
        Teacher teacher1 = new Teacher("Alice", 50000, "PhD", "Full-time");
        Teacher teacher2 = new Teacher("Bob", 40000, "MSc", "Part-time");
        DOO doo1 = new DOO("Charlie", 60000, "Senior");

        // Create HODs
        HOD hod1 = new HOD("Dr. Smith", 70000, "Computer Science");
        hod1.add(teacher1);
        hod1.add(teacher2);

        HOD hod2 = new HOD("Dr. Johnson", 75000, "Mathematics");
        hod2.add(doo1);

        // Create Director
        Director director = new Director("Prof. Williams", 100000);
        director.add(hod1);
        director.add(hod2);

        // Create University as subject
        University university = new University();
        university.attach(teacher1);
        university.attach(teacher2);
        university.attach(doo1);
        university.attach(hod1);
        university.attach(hod2);
        university.attach(director);

        // Create EmployeeController
        EmployeeController controller = new EmployeeController(director, university);

        // Generate organogram
        controller.generateOrganogram();

        // Activate bonus
        controller.activateBonus("Yearly Bonus", 10);
    }
}

