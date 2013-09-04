/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete1;

/**
 *
 * @author netzl_000
 */
public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear, int employeeID, String employeeName, String employeeJobTitle) {
        super(employeeID, employeeName, employeeJobTitle);
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }    

    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    
}
