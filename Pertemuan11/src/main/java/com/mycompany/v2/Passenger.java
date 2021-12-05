/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.v2;

/**
 *
 * @author Asus
 */

public class Passenger {
    private String name;
    private boolean vip;
    
    /*Constructor*/
    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }
    
    /*Getter*/
    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}