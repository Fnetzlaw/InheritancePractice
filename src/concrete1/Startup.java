/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete1;

/**
 *
 * @author netzl_000
 */
public class Startup {

    public static void main(String[] args) {
          
        
        
        HourlyEmployee emp = new HourlyEmployee(10, 10, 1234, "Bob", "Fin Tech");
        SalariedEmployee sEmp = new SalariedEmployee(1000, 5678, "Sally", "Press");
        SalaryPlusBonusEmployee sbEmp = new SalaryPlusBonusEmployee(1000, 500, 9011, "Travis", "Computer Programmer");

        System.out.println("Employee ID: " + emp.getEmployeeName() + "\nEmployee Name: " + emp.getEmployeeName()
                + "\nEmployee Job: " + emp.getEmployeeJobTitle() + "\nEmployee Wage: " + emp.getAnnualWages());
        System.out.println("");
        System.out.println("Employee ID: " + sEmp.getEmployeeID() + "\nEmployee Name: " + sEmp.getEmployeeName()
                + "\nEmployee Job: " + sEmp.getEmployeeJobTitle() + "\nEmployee Salary: " + sEmp.getAnnualSalary());
        System.out.println("");
        System.out.println("Employee ID: " + sbEmp.getEmployeeID() + "\nEmployee Name: " + sbEmp.getEmployeeName()
                + "\nEmployee Job: " + sbEmp.getEmployeeJobTitle() + "\nEmployee Salary With Bonus: " + sbEmp.getTotalSalary());
    }
}
