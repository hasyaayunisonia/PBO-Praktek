/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Asus
 */

/** Tidak menggunakan operation handling **/
//public class OperasiFile {
//    public static void main(String[] args) {
//        File dataMahasiswa = new File("C://dataMahasiswa.txt");
//        FileReader baca = new FileReader(dataMahasiswa);
//    }
//}

/** Menggunakan operation handling **/
public class OperasiFile {
    public static void main(String[] args) {
        File dataMahasiswa = new File("C://dataMahasiswa.txt");
        try {
            FileReader baca = new FileReader(dataMahasiswa);
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        }
    }
}
