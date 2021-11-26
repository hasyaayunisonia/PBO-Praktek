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

/** Tidak menggunakan operation handling **/
//public class VariabelReference {
//    public static void main(String[] args) {
//        String x;
//        System.out.println("Nilai dari variabel x adalah " + x);
//        
//    }
//}

/** Menggunakan operation handling **/
public class VariabelReference {
    public static void main(String[] args) {
        String x;
        try {
        x = new String();
        System.out.println("Nilai dari variabel x adalah " + x);
        } catch (Exception e) {
            System.out.println("Tidak ada inisiasi");
        }
        
    }
}