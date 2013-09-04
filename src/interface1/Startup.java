/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author netzl_000
 */
public class Startup {

    public static void main(String[] args) {

        HourlyEmployee employeeOne = new HourlyEmployee("Bob", 12, 10, 10);
        SalariedEmployee salaryOne = new SalariedEmployee("Sally", 34, 1000);
        SalaryPlusBonusEmployee salaryBonusOne = new SalaryPlusBonusEmployee("Travis", 56, 1000, 500);
        
        Employee[] employee = {employeeOne, salaryOne, salaryBonusOne};
        
        for(Employee e : employee){
            System.out.println("Employee Name: " + e.getEmployeeName());
            System.out.println("Employee ID: " + e.getEmployeeID());
            System.out.println("Employee Income: " + e.getAnnualWages());
            System.out.println("");
        }
        
    }
}
