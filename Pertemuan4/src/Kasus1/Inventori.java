<<<<<<< HEAD
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

public class Inventori {
    Barang[] barangs;
    void initBarang() {  //inisialiasi array
        barangs = new Barang[2]; 
        barangs[0] = new Barang("001", "Baju", 10); //data array barangs di indeks ke-0 
        barangs[1] = new Barang("002", "Celana", 20); //data array barangs di indeks ke-1
    }

    void showBarang() { //menampilkan output nama_barang dan stok dari array barangs 
        /* before */
        //System.out.println(barangs[0].nama_barang + "(" + barangs[0].stok + ")"); 
        //System.out.println(barangs[1].nama_barang + "(" + barangs[1].stok + ")");
        
        /* after */
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
        
    }

    void pengadaan() { 
        initBarang(); //inisialiasi array
      
        /* before */
        //barangs[0] += 20);
        //barangs[0] -= 20);
        //barangs[0] *= 20);
        //barangs[0].setStok(barangs[0].getStok() + 20);
        //barangs[0].setStok(barangs[0].getStok() - 30); //Bisa juga dikurangi dong?
        //barangs[0].setStok(barangs[0].getStok() * 30); //dikali juga bisa dong?
        
        /* after */
        barangs[0].setStok(20);

        showBarang (); //menampilkan output
    }

    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan(); //memanggil modul pengadaan
    }
=======
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

public class Inventori {
    Barang[] barangs;
    void initBarang() {  //inisialiasi array
        barangs = new Barang[2]; 
        barangs[0] = new Barang("001", "Baju", 10); //data array barangs di indeks ke-0 
        barangs[1] = new Barang("002", "Celana", 20); //data array barangs di indeks ke-1
    }

    void showBarang() { //menampilkan output nama_barang dan stok dari array barangs 
        /* before */
        //System.out.println(barangs[0].nama_barang + "(" + barangs[0].stok + ")"); 
        //System.out.println(barangs[1].nama_barang + "(" + barangs[1].stok + ")");
        
        /* after */
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
        
    }

    void pengadaan() { 
        initBarang(); //inisialiasi array
      
        /* before */
        //barangs[0] += 20);
        //barangs[0] -= 20);
        //barangs[0] *= 20);
        //barangs[0].setStok(barangs[0].getStok() + 20);
        //barangs[0].setStok(barangs[0].getStok() - 30); //Bisa juga dikurangi dong?
        //barangs[0].setStok(barangs[0].getStok() * 30); //dikali juga bisa dong?
        
        /* after */
        barangs[0].setStok(20);

        showBarang (); //menampilkan output
    }

    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan(); //memanggil modul pengadaan
    }
>>>>>>> 92e2b076ae315c3cd18081e6671fd453561f00b6
}