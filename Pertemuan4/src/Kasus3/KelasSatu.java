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
class KelasSatu {
    
    //initialization block
    {
        System.out.println(11); //menampilkan output angka 11
    }
    
    // static initialization block
    static
    {
        System.out.println(2); //menampilkan output angka 2
    }
    
    //constructor
    public KelasSatu (int i)
    {
        System.out.println(3); //menampilkan output angka 3
    }
    
    //constructor
    public KelasSatu() 
    {
        System.out.println(4); //menampilkan output angka 4
    }
    
}
