/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */

class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l; //variabel i bertipe integer menampung hasil konversi variabel l yang bertipe long menjadi integer
        return (short)i; //me-returnkan value dari variabel i yang dikonversi menjadi tipe data short
    }
    
    public static void main(String[] args) {
        double d = 10.25; //variabel d bertipe data double diisi dengan value 10.25
        float f = (float) d; //variabel f bertipe float menampung hasil konversi variabel d yang bertipe double menjadi float
        byte b = (byte) methodOne((long) f); //modul methodOne dengan parameter variabel f dipanggil
                                             //parameter variabel f yang bertipe data float di konversi menjadi long
                                             //dari modul methodOne akan me-returnkan value bertipe data short  yang dikoversi
                                             //menjadi byte kemudian ditampung oleh variabel b yang bertipe byte
        System.out.println(b);
    }
}

