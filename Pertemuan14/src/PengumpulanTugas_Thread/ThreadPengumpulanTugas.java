/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengumpulanTugas_Thread;

/**
 *
 * @author Asus
 */

public class ThreadPengumpulanTugas extends Thread{
    private Thread thread;
    private String namaSiswa;
    
    public ThreadPengumpulanTugas (String namaSiswa) {
        this.namaSiswa = namaSiswa;
        System.out.println(namaSiswa + " diberikan tugas sebanyak 5 soal");
    }
    
    @Override
    public void run() {
        
        try {
            System.out.println(namaSiswa + " mulai mengerjakan soal");
            for (int i = 1; i < 6; i++) {
                System.out.println(namaSiswa + " sedang mengerjakan soal ke-" + i);
                Thread.sleep(500);
                if(i == 5 ) {
                    System.out.println(namaSiswa + " selesai mengerjakan tugas");
                    System.out.println(namaSiswa + " mengumpulkan tugas pada guru");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Pengerjaan soal atas nama " + namaSiswa + " diinterupssi");
        }
        
    }
    
    @Override
    public void start() {
        
        if(thread == null) { //belum diintansiasi
            thread = new Thread(this, namaSiswa);
            thread.start(); //mempersiapkan thread ke fase runnable
        }
    }
    
        public void start(int priority) {
        
        if(thread == null) { 
            thread = new Thread(this, namaSiswa);
            thread.setPriority(priority); //bisa menentukan priority
            thread.start();
        }
    }
}
