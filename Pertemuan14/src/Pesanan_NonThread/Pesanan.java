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

public class Pesanan {
    private int pesanan;
    
    public Pesanan(int a) {
        this.pesanan = a;
        for (int x= 1; x <= a; x++) {
            System.out.println("Pelayan mengambil data pesanan dari customer ke-" + x);
        }
    }
    
    public void ProsesPesanan() {
        for(int a=1; a<= pesanan; a++) {
            System.out.println("Pelayan memberikan pesanan customer ke-" + a + " pada Chef");
            System.out.println("Pesanan customer ke-" + a + " sedang di proses Chef");
        }
        
        for(int a=1; a<= pesanan; a++) {
            System.out.println("Chef sudah selesai memproses pesanan customer ke-" + a);
            System.out.println("Pelayan memberikan pesanan pada customer ke-" + a);
        }
    }
}
