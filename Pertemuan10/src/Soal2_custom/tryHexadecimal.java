/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2_custom;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class tryHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan hexadesimal = ");
        String a = input.next();
        try {
            parseHex(a);
        } catch (HexadecimalFormatException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void parseHex (String s) throws HexadecimalFormatException {

        s = s.toUpperCase();
        if(s.matches("[0-9].*|[A-Z].*|[A-Z].*[0-9]|[0-9].*[A-Z]")) {
            int value = Integer.parseInt(s, 16);
            System.out.println("Dalam bilangan desimal = " + value );
        }else {
            throw new HexadecimalFormatException();
        }
    }
}
