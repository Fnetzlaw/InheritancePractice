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

    private double hourlyRate;
    private double totalHrsForYear;
    
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    /**
     * @return the hourlyRate
     */
    public final double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the totalHrsForYear
     */
    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * @param totalHrsForYear the totalHrsForYear to set
     */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
}
