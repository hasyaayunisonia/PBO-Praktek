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

/* Represents a staff member that work as a volunteer */
public class Volunteer extends StaffMember{
    //sets up a volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }
    
    //returns a zero payvalue for this volunteer
    public double pay() {
        return 0.0;
    }
}
