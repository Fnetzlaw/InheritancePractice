/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author netzl_000
 */
public class SalaryPlusBonusEmployee implements Employee {

    private int employeeID;
    private double annualSalary;
    private double annualBonus;
    private String employeeFullName;

    public SalaryPlusBonusEmployee(String employeeFullName, int employeeID, double annualSalary, double annualBonus) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
    }

    @Override
    public double getAnnualWages() {
        return annualBonus + annualSalary;
    }

    @Override
    public String getEmployeeName() {
        return employeeFullName;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }
}
