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

        HourlyEmployee employeeOne = new HourlyEmployee(10, 10);
        SalariedEmployee salaryOne = new SalariedEmployee(1000);
        SalaryPlusBonusEmployee salaryBonusOne = new SalaryPlusBonusEmployee(500);
        
        
        System.out.println("Employee One Made: " + employeeOne.getAnnualWages());
        System.out.println("Salary Person Made: " + (salaryOne.getAnnualWages() + salaryBonusOne.getAnnualWages()));

    }
}
