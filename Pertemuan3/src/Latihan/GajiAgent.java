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

public class GajiAgent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int GajiPokok = 500000; //konstanta GajiPokok bertipe integer
                                      //diisikan nilai gaji prokok agen
        final int Hargaitem = 50000; //konstanta Hargaitem bertipe integer 
                                     //diisikan harga setiap item 
        final int Harga15item = 750000; //konstanta Harga15item bertipe integer
                                        //diisikan harga dari 15 item                             
        final double Bonus1 = 0.1;//konstanta Bonus1 bertipe double 
                                  //diisikan 0.1 (10%)
        final double Bonus2 = 0.25;//konstanta Bonus2 bertipe double 
                                  //diisikan 0.25 (25%)
        final double Bonus3 = 0.35;//konstanta Bonus3 bertipe double
                                   //diisikan 0.35 (35%)
        final double Denda = 0.15; //konstanta Denda bertipe double
                                   //diisikan 0.15 (15%)
        
        
        double gajiditerima, bonus;
        
        int jmlpenjualan = input.nextInt();
        
        if (jmlpenjualan >= 0 && jmlpenjualan < 15) {
            double totalminuspenjualan, denda;
            totalminuspenjualan = Harga15item - (jmlpenjualan * Hargaitem);
            denda = Denda * totalminuspenjualan ;
            gajiditerima = GajiPokok - denda;
            System.out.println((int)gajiditerima);
        }
        else if (jmlpenjualan >= 15 && jmlpenjualan < 40){
            bonus = Bonus1 * Hargaitem * jmlpenjualan;
            gajiditerima = GajiPokok + bonus;
            System.out.println((int)gajiditerima);
        }
        else if(jmlpenjualan >= 40 && jmlpenjualan <= 80) {
            bonus = Bonus2 * Hargaitem * jmlpenjualan;
            gajiditerima = GajiPokok + bonus;
            System.out.println((int)gajiditerima);
        } else {
            bonus = Bonus3 * Hargaitem * jmlpenjualan;
            gajiditerima = GajiPokok + bonus;
            System.out.println((int)gajiditerima);
        }
        
    }
}






































