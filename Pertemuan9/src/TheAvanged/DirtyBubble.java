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

public class DirtyBubble extends SuperHero{
    
    public DirtyBubble(String name, int powerLevel) {
        /* Disini bisa menggunakan method yang ada di class SuperHero */
        // Parameter yang bernama name dan powerLevel dikirimkan ke constructor Superhero(String name, int powerLevel)      
        super(name, powerLevel);  
        
        //DirtyBubble adalah jenis pahlawan yang dapat Terbang dan memiliki Kekuatan Super
        super.addPower(new Flying()); //menambahkan kekuatan terbang ke dalam powerList
        super.addPower(new Strength()); //menambahkan kekuatan super ke dalam powerList
    }

    @Override
    public void identity(){
        System.out.print("It's " + this.getName() + ", the DirtyBubble! "
                + "It has the power level of " + this.getPowerLevel());
    }
}