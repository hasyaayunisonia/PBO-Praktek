/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Asus
 */

public abstract class Flight { 
    private String id;
    List<Passenger> passengers = new ArrayList<Passenger>(); 
    
    public Flight(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }
    public abstract boolean addPassenger(Passenger passenger); 
    public abstract boolean removePassenger(Passenger passenger); 
}
