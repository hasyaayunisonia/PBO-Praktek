/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author Asus
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin"; //variabel name yang bertipe string di isi dengan "Ipin"
    }
    
    public Item(String name) {
        //this.name = name;
        //this.name = "Ipin";
        //name = "Ipin";
        this(); //memanggil constructor
        System.out.println(this.name); //menampilkan output
    }
    
}

