/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesanan_NonThread;

/**
 *
 * @author Asus
 */

public class PesananMain {
    public static void main(String[] args) {
        System.out.println("\t========= Pemesanan Makanan =========");
        Pesanan p = new Pesanan(10);
        p.ProsesPesanan();
    }
}
