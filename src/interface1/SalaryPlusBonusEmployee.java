/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;
/**
 *
 * @author netzl_000
 */
public class SalaryPlusBonusEmployee implements Employee{
    private double annualBonus;

    public SalaryPlusBonusEmployee(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    
    @Override
    public double getAnnualWages() {
      return annualBonus;
    }
    
}
