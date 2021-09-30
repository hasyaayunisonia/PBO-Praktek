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
        
        switch(operator)  {
            case "+" :  hasil = angka1+angka2; //variabel hasil menampung hasil penjumlahan
                                               //antara value variabel angka1 dengan angka2
                        System.out.println(hasil);
                        break;
            case "-" :  hasil = angka1-angka2;//variabel hasil menampung hasil pengurangan
                                              //antara value variabel angka1 dengan angka2
                        System.out.println(hasil);
                        break;
            case "*" :  hasil = angka1*angka2; //variabel hasil menampung hasil perkalian
                                               //antara value variabel angka1 dengan angka2
                        System.out.println(hasil);
                        break;
            case "/" :  hasil = angka1/angka2;//variabel hasil menampung hasil perkalian
                                               //antara value variabel angka1 dengan angka2
                         System.out.println(hasil);
                        break;
            case "%" :  hasil = angka1%angka2;//variabel hasil menampung hasil sisa pembagian
                                               //antara value variabel angka1 dengan angka2
                        System.out.println(hasil);
                        break;
        } 
        
    }
}
