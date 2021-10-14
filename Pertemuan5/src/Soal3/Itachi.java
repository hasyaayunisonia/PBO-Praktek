/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author Asus
 */

public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo"; //variabel KekkeiGenkai bertipe data string dengan hak akses private
                                             //di isi dengan "Susanoo"
    private String Dojutsu = super.Dojutsu;//variabel Dojutsu bertipe data string dengan hak akses private
                                           //di isi dengan super.Dojutsu yang akan mengakses atribut Dojutsu dari superclass 
                                           //yang ada di kelas Rikudo
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai); //this.KekkeiGenkai akan mengakses atribut KekkeiGenkai yang ada di kelas ini
    }
    
    void printDojutsu() {
        System.out.println(this.Dojutsu); //this.Dojutsu akan mengakses atribut Dojutsu yang ada di kelas ini
                                          //(lebih tepat nya yang telah di isi dengan super.Dojutsu)
        setDojutsu(); //tambahan
        System.out.println(this.Dojutsu); //this.Dojutsu disini akan mengakses atribut Dojutsu
                                          //yang ada di setDojutsu();
    }
    
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}
