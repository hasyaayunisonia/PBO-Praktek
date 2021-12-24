/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesanan_Thread;

/**
 *
 * @author Asus
 */

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("\t========= Pemesanan Makanan =========");
        ThreadMethod tm = new ThreadMethod(10, "Pesanan");
        tm.start();
//        tm.start(Thread.MIN_PRIORITY);
//        tm.start(Thread.NORM_PRIORITY);
//        tm.start(Thread.MAX_PRIORITY);
    }
}
