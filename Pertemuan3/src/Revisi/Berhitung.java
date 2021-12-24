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

public class Berhitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil; //variabel hasil bertipe integer
        int angka1 = input.nextInt(); //variabel angka1 bertipe integer untuk 
                                      //menampung inputan berupa angka
        String operator = input.next(); //variabel operator bertipe String menampung
                                        //inputan seperti + - * / % 
        int angka2 = input.nextInt();//variabel angka2 bertipe integer untuk 
                                     //menampung inputan berupa angka
                                     
        if((angka1 >= 1 && angka1<=1000) && (angka2 >= 1 && angka2<=1000)) {
            //semua kode didapet dari ASCI
            //operator.charAt(0) nah si 0 nya tuh posisi karakter dimulai dari nol
            //eeh 0 tuh ngambil angka pertama
            //jadi kek ngebaca satu digit huruf aja
            if(operator.charAt(0) == 43) { 
                hasil = angka1+angka2;
                System.out.println(hasil);
            } else if(operator.charAt(0) == 45) {
                hasil = angka1-angka2;
                System.out.println(hasil);
            }else if(operator.charAt(0) == 42) {
                hasil = angka1*angka2;
                System.out.println(hasil);
            }else if(operator.charAt(0) == 47) {
                if (angka1 % angka2 != 0){ 
                    System.out.println("Pembagian tidak dapat dilakukan"); 
                } 
                else { 
                   hasil = angka1 / angka2; 
                   System.out.println(hasil);
                }
            }else if(operator.charAt(0) == 37) {
                hasil = angka1 % angka2;
                System.out.println(hasil);
            } else {
                System.out.println("Input tidak sesuai");
            }
            
            //System.out.println(hasil);
        }
    }
}

