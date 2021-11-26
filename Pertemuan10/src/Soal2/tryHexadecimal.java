/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */

public class tryHexadecimal {
    public static int parseHex(String hex) {

    try {
        return Integer.parseInt(hex, 16); 
    } catch (NumberFormatException e) {
        return 0;
    }
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan hexadesimal = ");
        String a = input.next();
        
        if(parseHex(a) != 0 ) {
            System.out.println("Dalam bilangan desimal = " + parseHex(a));
        } else if ((parseHex(a) == 0 ) && (a.equalsIgnoreCase("0"))) {
            System.out.println("Dalam bilangan desimal = " + parseHex(a));
        }else {
            System.out.println("Inputan tidak valid!");
        }
    }
}
