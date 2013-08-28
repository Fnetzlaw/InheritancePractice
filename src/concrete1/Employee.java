/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete1;

/**
 *
 * @author netzl_000
 */
public class Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    private double annualSalary;
    private double annualBonus;
    
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the totalHrsForYear
     */
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * @param totalHrsForYear the totalHrsForYear to set
     */
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
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
