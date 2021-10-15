/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author Asus
 */

public class Sasuke extends Itachi { 
    String Dojutsu = "Sharingan"; //variabel Dojutsu bertipe data string 
                                  //di isi dengan "Sharingan"
    
    void printDojutsu() {
        super.printDojutsu(); //super.printDojutsu() akan mengakses superclass method yaitu kelas Itachi
        System.out.println(this.Dojutsu); //this.Dojutsu akan mengakses atribut Dojutsu yang ada di kelas ini
    }
}

