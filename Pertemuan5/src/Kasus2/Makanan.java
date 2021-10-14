/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author Asus
 */
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan(String _namaMakanan, double _hargaMakanan, int _stok)
    {
        this.nama_makanan = _namaMakanan;
        this.harga_makanan = _hargaMakanan;
        this.stok = _stok;
    }
    
    /* Encapsulasi (getter dan setter)*/
    public String getNamaMakanan()
    {
        return nama_makanan;
    }
    
    public int getStok()
    {
        return stok;
    }
    
    /* Untuk Tampil nama, stok, dan harga makanan */
    public void TampilMakanan()
    {
        System.out.println(nama_makanan + "[" + stok + "]" + "Rp." + harga_makanan);
    }
    
    /* Untuk Stok */
    public void kurangStok(int jumlah)
    {
        stok -= jumlah;
    }
}
