/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2_custom;

/**
 *
 * @author Asus
 */
public class HexadecimalFormatException extends Exception{
    @Override
    public String getMessage() {
      return "Bukan format hexadecimal!";
   }
}
