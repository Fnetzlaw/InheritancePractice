/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author netzl_000
 */
public class SalaryPlusBonusEmployee extends Employee {

    private double annualBonus;
    

    public SalaryPlusBonusEmployee(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    @Override
    public void getAnnualWages() {
       
    }

    /**
     * @return the annualBonus
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * @param annualBonus the annualBonus to set
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
}
