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
public class InputdanOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String s = input.nextLine(); //variabel s bertipe String menampung inputan
        
        s = s.trim(); //menghapus spasi dari inputan
        if(s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+"); //memisahkan string
            System.out.println(strings.length); //menampilkan panjang string
            for (String str : strings)
                System.out.println(str); //menampilkan string yang telah dipisah
        }
    }
}

    

