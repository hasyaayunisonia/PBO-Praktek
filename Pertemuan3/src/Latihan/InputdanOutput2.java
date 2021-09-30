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

import java.util.Scanner;

public class InputdanOutput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cek = new String [3]; //variabel array cek bertipe String mrmpunyai 3 indeks 
        int[] x = new int [3]; //variabel array x bertipe integer mempunyai 3 indeks 
        for(int a = 0; a<cek.length; a++ ) {
            cek[a] = input.next(); //variabel cek menampung inputan bertipe String
            x[a] = input.nextInt(); //variabel x menampung inputan bertipe integer
        }
        
        System.out.println("================================");
        for(int b = 0; b<cek.length; b++ ) { 
            System.out.printf ("%-15s %03d %n", cek[b], x[b]); 
            //menampilkan output dari inputan
        }
        System.out.println("================================");
    }
}