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

public class Soal1_DataTypes {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of test cases = "); //melakukan input jumlah kasus uji
        int T = input.nextInt(); //variabel T dengan tipe data integer menampung inputan jumlah kasus uji
        
        /*pengulangan untuk input angka sebanyak jumlah kasus uji yang telah ditetapkan*/
        for(int a=0; a < T; a++ ) {  
            try { 
                //perintah untuk dieksekusi yang memungkinkan terjadinya exception (pengecualian)

                System.out.print("Enter number = "); //melakukan input angka uji
                long n = input.nextLong(); //variabel n dengan tipe data long menampung inputan angka uji
                System.out.println(n + " can be fitted in : ");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    //jika angka uji yang ditampung variabel n berada diantara range -128 sampai 127 
                    //maka dapat dikategorikan ke dalam tipe data byte
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    //jika angka uji yang ditampung variabel n berada diantara range -32768 sampai 32767 
                    //maka dapat dikategorikan ke dalam tipe data short
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    //jika angka uji yang ditampung variabel n berada diantara  
                    //range -2147483648 sampai 2147483647 maka dapat dikategorikan ke dalam tipe data integer
                    System.out.println("* integer");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    //jika angka uji yang ditampung variabel n berada diantara range  
                    //-9223372036854775808 sampai 9223372036854775807 maka dapat dikategorikan ke dalam tipe data long
                    System.out.println("* long");
                }
                //else {
                //    System.out.println(n +" can’t be fitted anywhere");
                //}
            }
            catch(Exception e) {
                    //perintah yang dieksekusi apabila terdapat exception atau kesalahan pada blok try
                
                System.out.println(input.next()+ " can’t be fitted anywhere.");
            }
        }
    }
} 

