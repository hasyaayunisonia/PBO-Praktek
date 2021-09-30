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
public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long plat1 = input.nextLong(); //variabel plat1 bertipe long menampung inputan
                                   //dari keyboard
        String s1 = Long.toString(plat1);//variabel s1 bertipe String menampung
                                   //hasil konversi variabel plat1 dari integer ke
                                   //String
        long plat2 = input.nextLong(); //variabel plat1 bertipe long menampung inputan
                                   //dari keyboard
        String s2 = Long.toString(plat2);//variabel s2 bertipe String menampung
                                   //hasil konversi variabel plat2 dari integer ke
                                   //String
        long plat3 = input.nextLong();//variabel plat3 bertipe long menampung inputan
                                   //dari keyboard 
        String s3 = Long.toString(plat3);//variabel s3 bertipe String menampung
                                   //hasil konversi variabel plat3 dari integer ke
                                   //String
        long plat4 = input.nextLong(); //variabel plat4 bertipe long menampung inputan
                                   //dari keyboard
        String s4 = Long.toString(plat4);//variabel s4 bertipe String menampung
                                   //hasil konversi variabel plat4 dari integer ke
                                   //String

        String s = s1 + s2 + s3 + s4; //variabel s bertipe String menampung 
                                      //hasil gabungan String s1, s2, s3, s4
        
        long hasil = Long.parseLong(s); //konversi gabungan String dari variabel s
                                        //ke long lalu di tampung di varibel hasil
                                        //bertipe data long
        
        long hasilkurangi = hasil - 999999; //variabel hasilkurangi bertipe long
                                            //menampung hasil pengurangan dari 
                                            //value variabel hasil dengan 999999
        
        long hasil_bagi = hasil % 5; //variabel hasil_bagi bertipe long menampung
                                    //sisa bagi dari value variabel hasil dengan 5
        
        if (hasil_bagi == 0) {
             System.out.println("berhenti");
        } else {
             System.out.println("jalan");
        }
        
        //System.out.println(hasil);
        //System.out.println(hasil_bagi);
    }
}
