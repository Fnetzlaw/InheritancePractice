/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author netzl_000
 */
public final class HourlyEmployee implements Employee {
    private int employeeID;
    private String employeeFullName;
    private double hourlyRate;
    private double totalHrsForYear;
    
    
    public HourlyEmployee(String employeeFullName, int employeeID, double hourlyRate, double totalHrsForYear) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    @Override
    public String getEmployeeName() {
        return employeeFullName; 
    }
    
    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    
  

    
}
