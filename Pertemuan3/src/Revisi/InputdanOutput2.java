/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisi;

/**
 *
 * @author Asus
 */

import java.util.Scanner;

public class InputdanOutput2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kata = new String [3]; //variabel array cek bertipe String mrmpunyai 3 indeks 
        int[] angka = new int [3]; //variabel array x bertipe integer mempunyai 3 indeks 
        for(int a = 0; a<kata.length; a++ ) {
            kata[a] = input.next(); //variabel cek menampung inputan bertipe String
            angka[a] = input.nextInt(); //variabel x menampung inputan bertipe integer
            if (kata[a].length() > 10) {
                 System.out.println("Melebihi maksimal 10 karakter");
            }
            if (angka[a] < 0 && angka[a] > 999) {
                 System.out.println("Melebihi batas angka");
            }
        }
        
        System.out.println("================================");
        for(int b = 0; b<angka.length; b++ ) { 
            System.out.printf ("%-15s %03d %n", kata[b], angka[b]); 
            //menampilkan output dari inputan
        }
        System.out.println("================================");
    }
}
