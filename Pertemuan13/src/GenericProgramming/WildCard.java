/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author Asus
 */

import java.util.ArrayList;
import java.util.List;

interface Pesanan {
	void membuat_pesanan();
}

class Minuman implements Pesanan {
        @Override
	public void membuat_pesanan() {
            System.out.println("Menyiapkan minuman...");
	}
}

class Makanan implements Pesanan {
        @Override
	public void membuat_pesanan() {
            System.out.println("Menyiapkan makanan...");
	}
}

public class WildCard {
    private static void memesan(List<? extends Pesanan> pesanan) {	
        for(Pesanan p: pesanan ) {
            p.membuat_pesanan();
	}	
    }

    public static void main(String[] args) {
	List<Pesanan> pesanan = new ArrayList<>();
        pesanan.add(new Makanan());
        pesanan.add(new Minuman());
        System.out.println("=> Sedang dalam proses : ");
        memesan(pesanan);
		
	List<Makanan> makan =  new ArrayList<>();
	makan.add(new Makanan());
        System.out.println("=> Sedang dalam proses : ");
        memesan(makan);
		
	List<Minuman> minum = new ArrayList<>();
	minum.add(new Minuman());
        System.out.println("=> Sedang dalam proses : ");
	memesan(minum);	
    }
}
