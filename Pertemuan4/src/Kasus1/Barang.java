/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus1;

/**
 *
 * @author Asus
 */

public class Barang {

    String kode_barang;
    String nama_barang;
    private int stok;
    
    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) { //memasukan value ke dalam variabel stok
        this.stok = this.stok + stok; //membungkus informasi
    }
    
    /**
     * @return the stok
     */
    public int getStok() { //mengambil value dari variabel stok
        return stok; //mengembalikan nilai
    }
    
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }
}
