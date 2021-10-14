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
public class Restaurant {
    //private String[] nama_makanan;
    //private double[] harga_makanan;
    //private int[] stok;
    
    private static byte id=0;
    private Makanan[] menuMakanan;
    
    public Restaurant() {
        
        menuMakanan = new Makanan[10];
        //nama_makanan = new String[10];
        //harga_makanan = new double[10];
        //stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        
        this.menuMakanan[id] = new Makanan(nama, harga, stok);
        //this.nama_makanan[id] = nama;
        //this.harga_makanan[id] = harga;
        //this.stok[id] = stok;
    }
    
     public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                this.menuMakanan[i].TampilMakanan(); 
                //System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        /*if(stok[id] == 0){
            return true;
        }else{
            return false;
        }*/
        return menuMakanan[id].getStok() == 0;
    }
    
    public static void nextId(){
        id++;
    }
    
    /* Untuk menampilkan status pemesanan */
     public void Pemesanan(String namaMakanan, int jumlah)
    {
        for(int i = 0; i <= id; i++)
        {
            if(namaMakanan.equals(menuMakanan[i].getNamaMakanan()))
            {
                if(menuMakanan[i].getStok() >= jumlah)
                {
                    System.out.println("\nStatus : " + jumlah + " " + menuMakanan[i].getNamaMakanan() + " Terjual!");
                    menuMakanan[i].kurangStok(jumlah);
                }
                else System.out.println("\nStatus : " + "Stok " + menuMakanan[i].getNamaMakanan() + " tidak cukup!");
            }    
        }
    }
}

