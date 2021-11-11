/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7_3;

/**
 *
 * @author Asus
 */

/* It extends the Hourly class */
public class Commission extends Hourly{
    /* It has two instance variables */
    //one is the total sales the employee has made (type double)
    private double totalSales;
    //and the second is the commission rate for the employee
    private double commissionRate;
    
    /* The constructor takes 6 parameters */
    //the first 5 are the same as for Hourly (name, address, phone number, social security 
    //number, hourly pay rate) and the 6th is the commission rate for the employee
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eCommisionRate) {
        //The constructor should call the constructor of the parent class with the first 5 parameters
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // then use the 6th to set the commission rate. 
        commissionRate = eCommisionRate;
    }
    
    /* One additional method is needed: public void addSales (double totalSales)*/
    //that adds the parameter to the instance variable representing total sales. 
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }
    
    /* The pay method must call the pay method of the parent class to compute the pay for hours worked 
    then add to that the pay from commission on sales. (See the pay method in the Executive class.) */
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        //The total sales should be set back to 0 
        totalSales = 0;
        return payment;
    }
    /* The toString method needs to call the toString method of the parent class then add the total sales to that. */
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
    
}
