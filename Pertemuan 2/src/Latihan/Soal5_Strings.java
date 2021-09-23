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

public class Soal5_Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("String A = ");
        String A = input.nextLine(); //variabel A bertipe data String menampung inputan dari keyboard
        int hitstringA = A.length(); //variabel hitstringA bertipe integer menampung jumlah karakter pada var String A
        
        System.out.print("String B = ");
        String B = input.nextLine(); //variabel B bertipe data String menampung inputan dari keyboard
        int hitstringB = B.length(); //variabel hitstringB bertipe integer menampung jumlah karakter pada var String B
        
        int total = hitstringA + hitstringB; //variabel total bertipe data integer menampung hasil penjumlahan 
                                             //dari jumlah karakter variabel A dengan variabel B
        
        System.out.print("\n# Jumlah karakter String A dan B = " + total);
        
        System.out.print("\n# Berdasarkan urutan leksikografi, apakah String A lebih besar dari B ? ");
        int compare = A.compareTo(B); //variabel compare bertipe integer menampung hasil membandingkan dua buah String
                                      //yaitu var String A dengan var String B berdasarkan urutan posisi kamus
        if(compare < 0) {
            System.out.print("Ya");
        }
        else if(compare == 0) {
             System.out.print("A sebanding dengan B");
        }
        else {
            System.out.print("Tidak");
        }
        
        System.out.println("\n# String A dan B dalam satu baris = " + A.substring(0, 1).toUpperCase() + ""+A.substring(1)+" " + 
                            B.substring(0, 1).toUpperCase() + ""+ B.substring(1));
    }
}
