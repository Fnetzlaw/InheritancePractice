/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author netzl_000
 */
public class SalariedEmployee extends Employee {
   
    private double annualSalary;

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public void getAnnualWages() {
        System.out.println("Salary Person Made: " + annualSalary);
    }

    /**
     * @return the annualSalary
     */
    public double getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
