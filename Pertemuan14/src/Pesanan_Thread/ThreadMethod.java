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
public class ThreadMethod extends Thread{
    private Thread thread;
    private int pesanan;
    private String namaThread;
    
    public ThreadMethod(int a, String namaThread) {
        this.pesanan = a;
        this.namaThread = namaThread;
        for (int x= 1; x <= a; x++) {
            System.out.println("Pelayan mengambil data pesanan dari customer ke-" + x);
            try {
                    Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("Pengambilan data pesanan diinterupsi");
            }
        }
    }
    
    @Override
    public void run() {
        for(int a=1; a<= pesanan; a++) {
            System.out.println("Pelayan memberikan pesanan customer ke-" + a + " pada Chef");
            try {
                 System.out.println("Pesanan customer ke-" + a + " sedang di proses Chef");
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Pesanan diinterupsi");
            }
        }
        
        for(int a=1; a<= pesanan; a++) {
            System.out.println("Chef sudah selesai memproses pesanan customer ke-" + a);
            try {
                System.out.println("Pelayan memberikan pesanan pada customer ke-" + a);
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println("Pesanan diinterupsi");
            }
        }
    }
    
    @Override
    public void start() {
        
        if(thread == null) { //belum diintansiasi
            thread = new Thread(this, namaThread);
            thread.start(); //mempersiapkan thread ke fase runnable
        }
    }
    
    public void start(int priority) {
        
        if(thread == null) {
            thread = new Thread(this, namaThread);
            thread.setPriority(priority); //bisa menentukan priority
            thread.start();
        }
    }
}    

