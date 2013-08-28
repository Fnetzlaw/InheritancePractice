/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;
/**
 *
 * @author netzl_000
 */
public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }
            
    @Override
    public void getAnnualWages() {
           System.out.println("Employee made: " + hourlyRate * totalHrsForYear);
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
    
    
}
