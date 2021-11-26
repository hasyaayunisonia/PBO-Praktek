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
//public class OperasiTextFieldInteger {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan angka = ");
//        int angkaInt = input.nextInt();
//    }
//}

/** Menggunakan operation handling **/
public class OperasiTextFieldInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka = ");
            int angkaInt = input.nextInt();
        } catch (Exception e) {
            System.out.println("Inputan bukan termasuk integer!");
        }
    }
}
