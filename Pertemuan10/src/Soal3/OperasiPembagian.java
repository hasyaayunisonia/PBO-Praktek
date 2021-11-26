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
//public class OperasiPembagian {
//    
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukkan angka pembilang = ");
//        int a = input.nextInt();
//        System.out.print("Masukkan angka penyebut = ");
//        int b = input.nextInt();
//        
//        double hasil = a / b; 
//        
//        System.out.println("Hasil pembagian " + a + " dengan " + b + " adalah " + hasil);
//    }
//}

/** Menggunakan operation handling **/
public class OperasiPembagian {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pembilang = ");
        int a = input.nextInt();
        System.out.print("Masukkan angka penyebut = ");
        int b = input.nextInt();
        
        try {
            int hasil = a / b;
            System.out.println("Hasil pembagian " + a + " dengan " + b + " adalah " + hasil);
        } catch (ArithmeticException e){
            System.out.println("Tidak bisa di bagi");
        } 
    }
}
