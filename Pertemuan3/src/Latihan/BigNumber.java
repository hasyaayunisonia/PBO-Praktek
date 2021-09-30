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

import java.math.BigInteger;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        BigInteger angka1 = new BigInteger(input.next()); 
        BigInteger angka2 = new BigInteger(input.next());
        
        BigInteger hasiljumlah = angka1.add(angka2);//menjumlahkan dua bilangan
        BigInteger hasilperkalian = angka1.multiply(angka2); //mengalika dua bilangan
        
        System.out.println(hasiljumlah);
        System.out.println(hasilperkalian);
    }
}
