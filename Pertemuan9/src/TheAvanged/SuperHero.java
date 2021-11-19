/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAvanged;

/**
 *
 * @author Asus
 */

import java.lang.Comparable;
import java.util.*;


public abstract class SuperHero implements Comparable<SuperHero>{

    private int powerLevel;
    private String name;
    private List<Power> powerList;

    public SuperHero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.powerList = new ArrayList<Power>();
    }

    public int getPowerLevel(){
        return this.powerLevel;
    }

    public String getName(){
        return this.name;
    }

    public void addPower(Power power){
        this.powerList.add(power);
    }

    public void identity(){}

    public void showPowers() {
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + getName().toUpperCase());
        System.out.println("TIME TO SHOW YOU MY POWERS");
        for(Power power : powerList){
            power.doPower();
        }
    }

    @Override
    public int compareTo(SuperHero superhero) {
        if(this.powerLevel > superhero.getPowerLevel()){
            return 1;
        } else if (this.powerLevel < superhero.getPowerLevel()){
            return -1;
        } else{
            return 0;
        }
    }
}
