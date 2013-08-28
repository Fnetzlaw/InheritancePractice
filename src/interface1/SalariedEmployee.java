/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;
/**
 *
 * @author netzl_000
 */
public class SalariedEmployee implements Employee{
        
    private double annualSalary;

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double getAnnualWages() {
        return annualSalary;
    }
    
    
}
