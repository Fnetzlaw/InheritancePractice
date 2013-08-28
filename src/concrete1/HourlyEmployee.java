/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete1;

/**
 *
 * @author netzl_000
 */
public class HourlyEmployee extends Employee {
    
    Employee emp = new Employee();

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
        
        
    }
}
