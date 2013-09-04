/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author netzl_000
 */
public class SalariedEmployee implements Employee {
    private int employeeID;
    private String employeeFullName;
    private double annualSalary;

    public SalariedEmployee(String employeeFullName, int employeeID, double annualSalary) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.annualSalary = annualSalary;
    }

    @Override
    public double getAnnualWages() {
        return annualSalary;
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
