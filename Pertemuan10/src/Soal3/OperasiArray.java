/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */

/** Tidak menggunakan operation handling **/
//public class OperasiArray{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String nama[] = {"Hasya", "Ayuni", "Sonia"};
//        System.out.print("Masukkan jumlah batas maksimal indeks array = ");
//        int maks = input.nextInt();
//        
//        for (int i = 0; i < maks; i++) {
//            System.out.println("Nilai indeks array ke-" + i + " = "+ nama[i]);
//        }
//    }
//}

/** Menggunakan operation handling **/
public class OperasiArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama[] = {"Hasya", "Ayuni", "Sonia"};
        System.out.print("Masukkan jumlah batas maksimal indeks array = ");
        int maks = input.nextInt();
        
        try {
            for (int i = 0; i < maks; i++) {
                System.out.println("Nilai indeks array ke-" + i + " = "+ nama[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas maksimal");
        }
    }
}